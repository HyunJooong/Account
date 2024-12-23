package org.example.account.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.account.repository.AccountRepository;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
@Slf4j
public class RedisTestService {

    private final RedissonClient redisson;


    public String getRData() {
        RLock lock = redisson.getLock("sampleLock");

        try {
            boolean isLock = lock.tryLock(1, 3, TimeUnit.SECONDS);
            if (!isLock) {
                log.error("===Lock acquisition failed==========");
                return "Lock failed";
            }
        } catch (Exception e) {
            log.error("Redis lock failed");
        }
        return "get lock success";

    }

}

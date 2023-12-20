package com.yns.distlock.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class LockService {

    private final RedisDistributedLock lock;

    public LockService(RedisDistributedLock lock) {
        this.lock = lock;
    }

    public void performWithLock(String lockKey) throws InterruptedException {

        if(lock.acquireLock(lockKey, 15000, TimeUnit.MILLISECONDS)) {
            log.info("Lock acquired. Operation started.");

            Thread.sleep(200);

            log.info("Operation completed");
        }
        else {
            log.error("Failed to acquire lock. The resource is busy");
        }
    }
}

package com.eventify.wale.util;

import java.util.UUID;

public class UidFactory {
    public static String generateUid()
    {
        return UUID.randomUUID().toString();
    }
}

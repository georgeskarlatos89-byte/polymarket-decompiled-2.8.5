package org.chromium.support_lib_boundary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ProcessGlobalConfigConstants {
    public static final String CACHE_DIRECTORY_BASE_PATH = "CACHE_DIRECTORY_BASE_PATH";
    public static final String CONFIGURE_PARTITIONED_COOKIES = "CONFIGURE_PARTITIONED_COOKIES";
    public static final String DATA_DIRECTORY_BASE_PATH = "DATA_DIRECTORY_BASE_PATH";
    public static final String DATA_DIRECTORY_SUFFIX = "DATA_DIRECTORY_SUFFIX";
    public static final String UI_THREAD_STARTUP_MODE = "UI_THREAD_STARTUP_MODE";
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_LONG_TASKS = 1;
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_PLUS_MULTI_PROCESS = 4;
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_SHORT_TASKS = 2;
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_VERY_SHORT_TASKS = 3;
    public static final int UI_THREAD_STARTUP_MODE_DEFAULT = -1;
    public static final int UI_THREAD_STARTUP_MODE_SYNC = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ProcessGlobalConfigMapKey {
    }
}

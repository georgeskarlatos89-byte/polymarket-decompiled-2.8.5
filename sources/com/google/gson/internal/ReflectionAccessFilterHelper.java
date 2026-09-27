package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import defpackage.omf;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class ReflectionAccessFilterHelper {
    private ReflectionAccessFilterHelper() {
    }

    public static boolean canAccess(AccessibleObject accessibleObject, Object obj) {
        return AccessChecker.INSTANCE.canAccess(accessibleObject, obj);
    }

    public static ReflectionAccessFilter.FilterResult getFilterResult(List<ReflectionAccessFilter> list, Class<?> cls) {
        Iterator<ReflectionAccessFilter> it = list.iterator();
        while (it.hasNext()) {
            ReflectionAccessFilter.FilterResult check = it.next().check(cls);
            if (check != ReflectionAccessFilter.FilterResult.INDECISIVE) {
                return check;
            }
        }
        return ReflectionAccessFilter.FilterResult.ALLOW;
    }

    private static boolean isAndroidType(String str) {
        if (!str.startsWith("android.") && !str.startsWith("androidx.") && !isJavaType(str)) {
            return false;
        }
        return true;
    }

    public static boolean isAnyPlatformType(Class<?> cls) {
        String name = cls.getName();
        if (!isAndroidType(name) && !name.startsWith("kotlin.") && !name.startsWith("kotlinx.") && !name.startsWith("scala.")) {
            return false;
        }
        return true;
    }

    private static boolean isJavaType(String str) {
        if (!str.startsWith("java.") && !str.startsWith("javax.")) {
            return false;
        }
        return true;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class AccessChecker {
        static final AccessChecker INSTANCE;

        /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
        static {
            AccessChecker accessChecker;
            if (JavaVersion.isJava9OrLater()) {
                try {
                    final Method declaredMethod = AccessibleObject.class.getDeclaredMethod("canAccess", Object.class);
                    accessChecker = new AccessChecker() { // from class: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(null);
                        }

                        @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                        public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                            try {
                                return ((Boolean) declaredMethod.invoke(accessibleObject, obj)).booleanValue();
                            } catch (Exception e) {
                                omf.m("Failed invoking canAccess", e);
                                return false;
                            }
                        }
                    };
                } catch (NoSuchMethodException unused) {
                }
                if (accessChecker == null) {
                    accessChecker = new AccessChecker() { // from class: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.2
                        @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                        public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                            return true;
                        }
                    };
                }
                INSTANCE = accessChecker;
            }
            accessChecker = null;
            if (accessChecker == null) {
            }
            INSTANCE = accessChecker;
        }

        private AccessChecker() {
        }

        public abstract boolean canAccess(AccessibleObject accessibleObject, Object obj);

        public /* synthetic */ AccessChecker(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static boolean isJavaType(Class<?> cls) {
        return isJavaType(cls.getName());
    }

    public static boolean isAndroidType(Class<?> cls) {
        return isAndroidType(cls.getName());
    }
}

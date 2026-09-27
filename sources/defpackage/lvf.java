package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class lvf {
    public static final qvf a;
    public static final KClass[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [qvf] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        ?? r0 = 0;
        try {
            r0 = (qvf) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r0 == 0) {
            r0 = new Object();
        }
        a = r0;
        b = new KClass[0];
    }

    public static wka a(Class cls) {
        qvf qvfVar = a;
        return qvfVar.typeOf(qvfVar.getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, false);
    }

    public static wka b(Class cls, KTypeProjection kTypeProjection) {
        qvf qvfVar = a;
        return qvfVar.typeOf(qvfVar.getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static wka c(KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        qvf qvfVar = a;
        return qvfVar.typeOf(qvfVar.getOrCreateKotlinClass(Map.class), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }
}

package kotlin;

import defpackage.r5g;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0087@\u0018\u0000 \f*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\f\rB\u0013\b\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\n\u0088\u0001\u0005\u0092\u0001\u0004\u0018\u00010\u0004¨\u0006\u000e"}, d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "exceptionOrNull", "Companion", "r5g", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Result<T> implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final Object a;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/Result$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.a = obj;
    }

    public static String a(Object obj) {
        if (obj instanceof r5g) {
            return ((r5g) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m883exceptionOrNullimpl(Object obj) {
        if (obj instanceof r5g) {
            return ((r5g) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Result) {
            if (!Intrinsics.areEqual(this.a, ((Result) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m882constructorimpl(Object obj) {
        return obj;
    }
}

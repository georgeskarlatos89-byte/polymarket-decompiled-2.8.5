package kotlin;

import defpackage.woa;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004R\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "a", "Ljava/lang/Object;", "getFirst", "()Ljava/lang/Object;", "first", "b", "getSecond", "second", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Pair<A, B> implements Serializable {

    /* renamed from: a, reason: from kotlin metadata */
    public final Object first;

    /* renamed from: b, reason: from kotlin metadata */
    public final Object second;

    public Pair(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (Intrinsics.areEqual(this.first, pair.first) && Intrinsics.areEqual(this.second, pair.second)) {
            return true;
        }
        return false;
    }

    public final A getFirst() {
        return (A) this.first;
    }

    public final B getSecond() {
        return (B) this.second;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.first;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.second;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.first);
        sb.append(", ");
        return woa.q(sb, this.second, ')');
    }
}

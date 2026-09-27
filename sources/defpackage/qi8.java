package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qi8 implements Comparable {
    public static final qi8 b;
    public static final qi8 c;
    public static final qi8 d;
    public static final qi8 e;
    public static final qi8 f;
    public static final qi8 g;
    public static final qi8 h;
    public static final qi8 i;
    public static final qi8 j;
    public static final qi8 k;
    public static final qi8 l;
    public static final List m;
    public final int a;

    static {
        qi8 qi8Var = new qi8(100);
        qi8 qi8Var2 = new qi8(200);
        qi8 qi8Var3 = new qi8(300);
        qi8 qi8Var4 = new qi8(CarouselScreenFragment.CAROUSEL_ANIMATION_MS);
        b = qi8Var4;
        qi8 qi8Var5 = new qi8(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE);
        c = qi8Var5;
        qi8 qi8Var6 = new qi8(600);
        d = qi8Var6;
        qi8 qi8Var7 = new qi8(700);
        qi8 qi8Var8 = new qi8(800);
        e = qi8Var8;
        qi8 qi8Var9 = new qi8(900);
        f = qi8Var3;
        g = qi8Var4;
        h = qi8Var5;
        i = qi8Var6;
        j = qi8Var7;
        k = qi8Var8;
        l = qi8Var9;
        m = CollectionsKt.listOf(qi8Var, qi8Var2, qi8Var3, qi8Var4, qi8Var5, qi8Var6, qi8Var7, qi8Var8, qi8Var9);
    }

    public qi8(int i2) {
        this.a = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (!z) {
            lw9.a("Font weight can be in range [1, 1000]. Current value: " + i2);
        }
    }

    public final int a(qi8 qi8Var) {
        return Intrinsics.d(this.a, qi8Var.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((qi8) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi8)) {
            return false;
        }
        if (this.a == ((qi8) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return sv6.o(new StringBuilder("FontWeight(weight="), this.a, ')');
    }
}

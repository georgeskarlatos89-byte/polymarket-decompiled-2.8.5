package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g33 {
    public static final ow0 i = new ow0("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final ow0 j = new ow0("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final ow0 k = new ow0("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final ArrayList a;
    public final lld b;
    public final int c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final oki g;
    public final c03 h;

    public g33(ArrayList arrayList, lld lldVar, int i2, boolean z, ArrayList arrayList2, boolean z2, oki okiVar, c03 c03Var) {
        this.a = arrayList;
        this.b = lldVar;
        this.c = i2;
        this.e = Collections.unmodifiableList(arrayList2);
        this.f = z2;
        this.g = okiVar;
        this.h = c03Var;
        this.d = z;
    }

    public final Range a() {
        Range range = (Range) this.b.a(k, by0.h);
        Objects.requireNonNull(range);
        return range;
    }

    public final int b() {
        Object obj = this.g.a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int c() {
        Integer num = (Integer) this.b.a(pyj.Z0, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int d() {
        Integer num = (Integer) this.b.a(pyj.a1, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}

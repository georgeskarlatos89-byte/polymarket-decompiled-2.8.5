package defpackage;

import com.polymarket.data.EEnvironment;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class epe {
    public static final Map a;
    public static final dpe b;

    static {
        EEnvironment eEnvironment = EEnvironment.production;
        a = c1c.b(new Pair("com.polymarket.android", new dpe(455321622768L, vzg.b(eEnvironment))));
        b = new dpe(96745186840L, ArraysKt.l0(new EEnvironment[]{EEnvironment.localhost, EEnvironment.staging, EEnvironment.preprod, eEnvironment}));
    }
}

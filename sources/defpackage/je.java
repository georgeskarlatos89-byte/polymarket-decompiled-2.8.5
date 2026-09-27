package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.f;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class je {
    public static final Set a;
    public static final LinkedHashSet b;

    static {
        Set l0 = ArraysKt.l0(new String[]{"AU", "BE", "BR", "CA", "CH", "DE", "ES", "FR", "GB", "IE", "IT", "MX", "NO", "NL", "PL", "RU", "SE", "TR", "US", "ZA"});
        a = l0;
        b = f.h(l0, ArraysKt.l0(new String[]{"IN", "JP", "MY", "NZ", "PH", "SG"}));
    }
}

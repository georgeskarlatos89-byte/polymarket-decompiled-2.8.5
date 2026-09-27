package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkotlin/Pair;", "", "", "p0", "a", "(Ljava/util/List;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class a1 extends Lambda implements Function1<List<? extends Pair<? extends String, ? extends Integer>>, Integer> {
    public static final a1 h = new Lambda(1);
    public static int i = 0;
    public static int j = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.a1, kotlin.jvm.internal.Lambda] */
    static {
        if (((1 - (-6)) - 1) % 2 != 0) {
            int i2 = 28 / 0;
        }
    }

    public a1() {
        super(1);
    }

    public final Integer a(List<Pair<String, Integer>> list) {
        int i2 = j;
        i = (((i2 | 47) << 1) - (i2 ^ 47)) % 128;
        String str = (String) list.get(0).first;
        Pair<String, Integer> pair = list.get(1);
        String str2 = (String) pair.first;
        int intValue = ((Number) pair.second).intValue();
        if (StringsKt.T(str)) {
            i = (j + 77) % 128;
            if (StringsKt.T(str2)) {
                int identityHashCode = System.identityHashCode(this);
                int i3 = ~identityHashCode;
                int i4 = ~((i3 & 1143797247) | (1143797247 ^ i3));
                int i5 = -(-(((i4 & 1900100856) | (1900100856 ^ i4)) * 519));
                int i6 = ((-923245008) ^ i5) + ((i5 & (-923245008)) << 1);
                int i7 = (~identityHashCode) | 1143797247;
                int i8 = ~((i7 & 1900100856) | (i7 ^ 1900100856));
                int i9 = ~(((-70041864) & identityHashCode) | ((-70041864) ^ identityHashCode));
                int i10 = -(-(((i8 & i9) | (i8 ^ i9)) * (-519)));
                int i11 = ((i6 | i10) << 1) - (i10 ^ i6);
                int i12 = ~((identityHashCode & 1900100856) | (1900100856 ^ identityHashCode));
                int i13 = ((i12 & (-1143797248)) | ((-1143797248) ^ i12)) * 519;
                int i14 = ((i11 | i13) << 1) - (i13 ^ i11);
                int identityHashCode2 = System.identityHashCode(this);
                int i15 = -(-(((~((2057696639 & identityHashCode2) | (2057696639 ^ identityHashCode2))) | 681902367) * 501));
                int i16 = ((-702336140) & i15) + (i15 | (-702336140));
                int i17 = (i16 & 2008810112) + (2008810112 | i16);
                int i18 = (~identityHashCode2) | 1755644223;
                int i19 = -(-((~((i18 & 983954783) | (i18 ^ 983954783))) * 501));
                if (i14 <= ((i17 | i19) << 1) - (i19 ^ i17)) {
                    Integer valueOf = Integer.valueOf(intValue);
                    int i20 = 48 / 0;
                    return valueOf;
                }
                return Integer.valueOf(intValue);
            }
        }
        j = (i + 61) % 128;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Integer invoke(List<? extends Pair<? extends String, ? extends Integer>> list) {
        int i2 = j;
        i = ((i2 & 117) + (i2 | 117)) % 128;
        Integer a = a(list);
        int i3 = j;
        i = ((i3 ^ 85) + ((i3 & 85) << 1)) % 128;
        return a;
    }
}

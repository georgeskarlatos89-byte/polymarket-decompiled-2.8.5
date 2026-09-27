package io.intercom.android.sdk.ui.coil;

import defpackage.b9h;
import defpackage.bd0;
import defpackage.bt6;
import defpackage.dmk;
import defpackage.ft6;
import defpackage.phg;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\b\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lb9h;", "Lphg;", "scale", "Lkotlin/Function0;", "", "original", "widthPx", "(Lb9h;Lphg;Lkotlin/jvm/functions/Function0;)I", "heightPx", "Lft6;", "toPx", "(Lft6;Lphg;)I", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdfDecoderKt {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[phg.values().length];
            try {
                iArr[phg.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[phg.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ int access$toPx(ft6 ft6Var, phg phgVar) {
        return toPx(ft6Var, phgVar);
    }

    private static final int heightPx(b9h b9hVar, phg phgVar, Function0<Integer> function0) {
        if (Intrinsics.areEqual(b9hVar, b9h.c)) {
            return function0.invoke().intValue();
        }
        return access$toPx(b9hVar.b, phgVar);
    }

    private static final int toPx(ft6 ft6Var, phg phgVar) {
        if (ft6Var instanceof bt6) {
            return ((bt6) ft6Var).a;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[phgVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return bd0.API_PRIORITY_OTHER;
            }
            dmk.a();
            return 0;
        }
        return Integer.MIN_VALUE;
    }

    private static final int widthPx(b9h b9hVar, phg phgVar, Function0<Integer> function0) {
        if (Intrinsics.areEqual(b9hVar, b9h.c)) {
            return function0.invoke().intValue();
        }
        return access$toPx(b9hVar.a, phgVar);
    }
}

package io.intercom.android.sdk.m5.home.ui.components;

import com.fingerprintjs.android.fpjs_pro.g;
import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.e0k;
import defpackage.gj2;
import defpackage.hjc;
import defpackage.ikl;
import defpackage.kjc;
import defpackage.kpk;
import defpackage.lwi;
import defpackage.lxa;
import defpackage.nrf;
import defpackage.o54;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.qqc;
import defpackage.rtn;
import defpackage.sr8;
import defpackage.t35;
import defpackage.uwn;
import defpackage.xxi;
import defpackage.ylk;
import defpackage.yql;
import defpackage.zwi;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aG\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkjc;", "modifier", "", "text", "Lib4;", "color", "Lxxi;", "style", "Lkotlin/Function1;", "", "", "onTextWrap", "WrapReportingText-T042LqI", "(Lkjc;Ljava/lang/String;JLxxi;Lkotlin/jvm/functions/Function1;Lpq4;II)V", "WrapReportingText", "PreviewShortText", "(Lpq4;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WrapReportingTextKt {
    private static final void PreviewShortText(pq4 pq4Var, int i) {
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(381018303);
        if (i == 0 && sr8Var.F()) {
            sr8Var.Y();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$WrapReportingTextKt.INSTANCE.m333getLambda1$intercom_sdk_base_release(), sr8Var, 3072, 7);
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new kpk(i, 0);
        }
    }

    private static final Unit PreviewShortText$lambda$8(int i, pq4 pq4Var, int i2) {
        PreviewShortText(pq4Var, rtn.a(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* renamed from: WrapReportingText-T042LqI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m334WrapReportingTextT042LqI(kjc kjcVar, String str, long j, xxi xxiVar, Function1<? super Boolean, Unit> function1, pq4 pq4Var, int i, int i2) {
        kjc kjcVar2;
        int i3;
        int i4;
        String str2;
        int i5;
        long j2;
        int i6;
        xxi xxiVar2;
        int i7;
        Function1<? super Boolean, Unit> function12;
        int i8;
        kjc kjcVar3;
        uwn uwnVar;
        Function1<? super Boolean, Unit> function13;
        Object Q;
        qqc qqcVar;
        Object k;
        boolean z;
        Object Q2;
        sr8 sr8Var;
        Function1<? super Boolean, Unit> function14;
        nrf u;
        str.getClass();
        xxiVar.getClass();
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(834036955);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            kjcVar2 = kjcVar;
        } else if ((i & 6) == 0) {
            kjcVar2 = kjcVar;
            if (sr8Var2.h(kjcVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            kjcVar2 = kjcVar;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                if (sr8Var2.h(str2)) {
                    i5 = 32;
                } else {
                    i5 = 16;
                }
                i3 |= i5;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 384) == 0) {
                if (sr8Var2.g(j2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            xxiVar2 = xxiVar;
        } else {
            xxiVar2 = xxiVar;
            if ((i & 3072) == 0) {
                if (sr8Var2.h(xxiVar2)) {
                    i7 = 2048;
                } else {
                    i7 = Barcode.FORMAT_UPC_E;
                }
                i3 |= i7;
            }
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function12 = function1;
            if (sr8Var2.j(function12)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
            if ((i3 & 9363) != 9362 && sr8Var2.F()) {
                sr8Var2.Y();
                sr8Var = sr8Var2;
                kjcVar3 = kjcVar2;
                function14 = function12;
            } else {
                if (i9 == 0) {
                    kjcVar3 = hjc.a;
                } else {
                    kjcVar3 = kjcVar2;
                }
                uwnVar = oq4.a;
                if (i10 == 0) {
                    sr8Var2.e0(1070300984);
                    Object Q3 = sr8Var2.Q();
                    if (Q3 == uwnVar) {
                        Q3 = new ylk(8);
                        sr8Var2.o0(Q3);
                    }
                    function13 = (Function1) Q3;
                    sr8Var2.s(false);
                } else {
                    function13 = function12;
                }
                sr8Var2.e0(1070301976);
                Q = sr8Var2.Q();
                if (Q == uwnVar) {
                    Q = ikl.c(Boolean.FALSE);
                    sr8Var2.o0(Q);
                }
                qqcVar = (qqc) Q;
                k = g.k(1070306974, sr8Var2, false);
                z = true;
                if (k == uwnVar) {
                    k = new e0k(1, qqcVar);
                    sr8Var2.o0(k);
                }
                sr8Var2.s(false);
                kjc d = yql.d(kjcVar3, (Function1) k);
                sr8Var2.e0(1070309155);
                if ((57344 & i3) != 16384) {
                    z = false;
                }
                Q2 = sr8Var2.Q();
                if (!z || Q2 == uwnVar) {
                    Q2 = new o54(function13, qqcVar, 11);
                    sr8Var2.o0(Q2);
                }
                sr8Var2.s(false);
                sr8Var = sr8Var2;
                lwi.d(str2, d, j2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, (Function1) Q2, xxiVar2, sr8Var, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
                function14 = function13;
            }
            u = sr8Var.u();
            if (u == null) {
                u.d = new gj2(kjcVar3, str, j, xxiVar, function14, i, i2);
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & 9363) != 9362) {
        }
        if (i9 == 0) {
        }
        uwnVar = oq4.a;
        if (i10 == 0) {
        }
        sr8Var2.e0(1070301976);
        Q = sr8Var2.Q();
        if (Q == uwnVar) {
        }
        qqcVar = (qqc) Q;
        k = g.k(1070306974, sr8Var2, false);
        z = true;
        if (k == uwnVar) {
        }
        sr8Var2.s(false);
        kjc d2 = yql.d(kjcVar3, (Function1) k);
        sr8Var2.e0(1070309155);
        if ((57344 & i3) != 16384) {
        }
        Q2 = sr8Var2.Q();
        if (!z) {
        }
        Q2 = new o54(function13, qqcVar, 11);
        sr8Var2.o0(Q2);
        sr8Var2.s(false);
        sr8Var = sr8Var2;
        lwi.d(str2, d2, j2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, (Function1) Q2, xxiVar2, sr8Var, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
        function14 = function13;
        u = sr8Var.u();
        if (u == null) {
        }
    }

    private static final Unit WrapReportingText_T042LqI$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    private static final Unit WrapReportingText_T042LqI$lambda$4$lambda$3(qqc qqcVar, t35 t35Var) {
        t35Var.getClass();
        if (((Boolean) qqcVar.getValue()).booleanValue()) {
            ((lxa) t35Var).a();
        }
        return Unit.INSTANCE;
    }

    private static final Unit WrapReportingText_T042LqI$lambda$6$lambda$5(Function1 function1, qqc qqcVar, zwi zwiVar) {
        zwiVar.getClass();
        boolean z = true;
        if (zwiVar.b.f <= 1) {
            z = false;
        }
        function1.invoke(Boolean.valueOf(z));
        qqcVar.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private static final Unit WrapReportingText_T042LqI$lambda$7(kjc kjcVar, String str, long j, xxi xxiVar, Function1 function1, int i, int i2, pq4 pq4Var, int i3) {
        m334WrapReportingTextT042LqI(kjcVar, str, j, xxiVar, function1, pq4Var, rtn.a(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(qqc qqcVar, Function1 function1, zwi zwiVar) {
        return WrapReportingText_T042LqI$lambda$6$lambda$5(function1, qqcVar, zwiVar);
    }

    public static /* synthetic */ Unit b(int i, pq4 pq4Var, int i2) {
        return PreviewShortText$lambda$8(i, pq4Var, i2);
    }

    public static /* synthetic */ Unit c(kjc kjcVar, String str, long j, xxi xxiVar, Function1 function1, int i, int i2, pq4 pq4Var, int i3) {
        return WrapReportingText_T042LqI$lambda$7(kjcVar, str, j, xxiVar, function1, i, i2, pq4Var, i3);
    }

    public static /* synthetic */ Unit d(qqc qqcVar, t35 t35Var) {
        return WrapReportingText_T042LqI$lambda$4$lambda$3(qqcVar, t35Var);
    }

    public static /* synthetic */ Unit e(boolean z) {
        return WrapReportingText_T042LqI$lambda$1$lambda$0(z);
    }
}

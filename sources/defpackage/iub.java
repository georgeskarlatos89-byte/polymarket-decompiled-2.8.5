package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.input.ImeAction;
import com.google.mlkit.common.MlKitException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iub extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public static final iub i = new iub(1, 0);
    public static final iub j = new iub(1, 1);
    public static final iub k = new iub(1, 2);
    public static final iub l = new iub(1, 3);
    public static final iub m = new iub(1, 4);
    public static final iub n = new iub(1, 5);
    public static final iub o = new iub(1, 6);
    public static final iub p = new iub(1, 7);
    public static final iub q = new iub(1, 8);
    public static final iub r = new iub(1, 9);
    public static final iub s = new iub(1, 10);
    public static final iub t = new iub(1, 11);
    public static final iub u = new iub(1, 12);
    public static final iub v = new iub(1, 13);
    public static final iub w = new iub(1, 14);
    public static final iub x = new iub(1, 15);
    public static final iub y = new iub(1, 16);
    public static final iub z = new iub(1, 17);
    public static final iub A = new iub(1, 18);
    public static final iub B = new iub(1, 19);
    public static final iub C = new iub(1, 20);
    public static final iub D = new iub(1, 21);
    public static final iub E = new iub(1, 22);
    public static final iub F = new iub(1, 23);
    public static final iub G = new iub(1, 24);
    public static final iub H = new iub(1, 25);
    public static final iub I = new iub(1, 26);
    public static final iub J = new iub(1, 27);
    public static final iub K = new iub(1, 28);
    public static final iub L = new iub(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iub(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2 = true;
        boolean z3 = false;
        switch (this.h) {
            case 0:
                ene eneVar = (ene) obj;
                if (eneVar.c0()) {
                    lub lubVar = eneVar.b;
                    iub iubVar = lub.o;
                    if (!lubVar.k) {
                        Function1 c = eneVar.a.c();
                        iqc iqcVar = lubVar.n;
                        if (c == null) {
                            if (iqcVar != null) {
                                Object[] objArr = iqcVar.c;
                                long[] jArr = iqcVar.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j2 = jArr[i2];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((255 & j2) < 128) {
                                                    lubVar.X0((jqc) objArr[(i2 << 3) + i4]);
                                                }
                                                j2 >>= 8;
                                            }
                                            if (i3 != 8) {
                                            }
                                        }
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                }
                                iqcVar.g();
                            }
                        } else {
                            lubVar.E0(eneVar, 9223372034707292159L, 0L);
                            lubVar.g = c;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ((pn) obj).a().d = false;
                return Unit.INSTANCE;
            case 2:
                pn pnVar = (pn) obj;
                pnVar.a().e = pnVar.a().d;
                return Unit.INSTANCE;
            case 3:
                ((pn) obj).a().c = false;
                return Unit.INSTANCE;
            case 4:
                ((LayoutNode) obj).h = true;
                return Unit.INSTANCE;
            case 5:
                ((pn) obj).a().d = false;
                return Unit.INSTANCE;
            case 6:
                pn pnVar2 = (pn) obj;
                pnVar2.a().e = pnVar2.a().d;
                return Unit.INSTANCE;
            case 7:
                ((pn) obj).a().c = false;
                return Unit.INSTANCE;
            case 8:
                dpd dpdVar = ((x8d) obj).O;
                if (dpdVar != null) {
                    ((k09) dpdVar).c();
                }
                return Unit.INSTANCE;
            case 9:
                x8d x8dVar = (x8d) obj;
                LayoutNode layoutNode = x8dVar.p;
                try {
                    if (x8dVar.c0()) {
                        x8dVar.K1(true);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    layoutNode.u0(th);
                    throw null;
                }
            case 10:
                bgd bgdVar = (bgd) obj;
                if (bgdVar.c0()) {
                    bgdVar.a.L();
                }
                return Unit.INSTANCE;
            case 11:
                obj.getClass();
                return Boolean.valueOf(!((fpd) obj).c0());
            case 12:
                LayoutNode layoutNode2 = (LayoutNode) obj;
                if (layoutNode2.S()) {
                    layoutNode2.q0(false);
                }
                return Unit.INSTANCE;
            case 13:
                LayoutNode layoutNode3 = (LayoutNode) obj;
                if (layoutNode3.S()) {
                    layoutNode3.q0(false);
                }
                return Unit.INSTANCE;
            case 14:
                LayoutNode layoutNode4 = (LayoutNode) obj;
                if (layoutNode4.S()) {
                    layoutNode4.o0(false);
                }
                return Unit.INSTANCE;
            case 15:
                LayoutNode layoutNode5 = (LayoutNode) obj;
                if (layoutNode5.S()) {
                    layoutNode5.o0(false);
                }
                return Unit.INSTANCE;
            case 16:
                LayoutNode layoutNode6 = (LayoutNode) obj;
                if (layoutNode6.S()) {
                    LayoutNode.p0(layoutNode6, false, 7);
                }
                return Unit.INSTANCE;
            case 17:
                LayoutNode layoutNode7 = (LayoutNode) obj;
                if (layoutNode7.S()) {
                    LayoutNode.r0(layoutNode7, false, 7);
                }
                return Unit.INSTANCE;
            case MlKitException.UNSUPPORTED /* 18 */:
                LayoutNode layoutNode8 = (LayoutNode) obj;
                if (layoutNode8.S()) {
                    layoutNode8.Q();
                }
                return Unit.INSTANCE;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return Unit.INSTANCE;
            case 20:
                xxe xxeVar = (xxe) obj;
                if (xxeVar.isAttachedToWindow()) {
                    xxeVar.l();
                }
                return Unit.INSTANCE;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                syf syfVar = (syf) obj;
                syfVar.getClass();
                return "config_keys=" + syfVar.b();
            case 22:
                vyf vyfVar = (vyf) obj;
                vyfVar.getClass();
                if (vyfVar.a.get() != null) {
                    z3 = true;
                }
                return Boolean.valueOf(!z3);
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Integer.valueOf(((yjg) obj).b);
            case 25:
                return Integer.valueOf(((yjg) obj).c.b());
            case 26:
                if (((rf7) obj) != rf7.Visible) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 27:
                return new ib4(hpn.h(fji.a, ((ib4) obj).a));
            case 28:
                return Unit.INSTANCE;
            default:
                int i5 = ((ImeAction) obj).a;
                return Unit.INSTANCE;
        }
    }
}

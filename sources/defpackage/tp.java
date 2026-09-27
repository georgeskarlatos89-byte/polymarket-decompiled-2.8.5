package defpackage;

import android.media.MediaCodec;
import android.util.Size;
import androidx.compose.ui.node.LayoutNode;
import bo.app.nh;
import bo.app.sa;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.google.mlkit.common.MlKitException;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class tp implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ tp(us4 us4Var) {
        this.a = 24;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        rmd a;
        int i;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return String.valueOf(obj).compareTo(String.valueOf(obj2));
            case 1:
                return Intrinsics.d(((l6f) obj2).a, ((l6f) obj).a);
            case 2:
                return ((el8) obj2).j - ((el8) obj).j;
            case 3:
                return BrazeContentCardUtils.b((g43) obj, (g43) obj2);
            case 4:
                return Integer.compare(((ua3) obj2).b, ((ua3) obj).b);
            case 5:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 6:
                return Integer.compare(((vg6) ((List) obj).get(0)).f, ((vg6) ((List) obj2).get(0)).f);
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                return li4.g(dh6.c((dh6) Collections.max(list, new tp(10)), (dh6) Collections.max(list2, new tp(10)))).a(list.size(), list2.size()).c((dh6) Collections.max(list, new tp(11)), (dh6) Collections.max(list2, new tp(11)), new tp(11)).f();
            case 8:
                return ((ug6) Collections.max((List) obj)).c((ug6) Collections.max((List) obj2));
            case 9:
                return ((ah6) ((List) obj).get(0)).c((ah6) ((List) obj2).get(0));
            case 10:
                return dh6.c((dh6) obj, (dh6) obj2);
            case 11:
                dh6 dh6Var = (dh6) obj;
                dh6 dh6Var2 = (dh6) obj2;
                boolean z = dh6Var.e;
                int i3 = dh6Var.j;
                if (z && dh6Var.h) {
                    a = eh6.i;
                } else {
                    a = eh6.i.a();
                }
                dh6Var.f.getClass();
                return ni4.a.c(Integer.valueOf(dh6Var.k), Integer.valueOf(dh6Var2.k), a).c(Integer.valueOf(i3), Integer.valueOf(dh6Var2.j), a).f();
            case 12:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b = bArr[i4];
                    byte b2 = bArr2[i4];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 13:
                return Intrinsics.d(((g8a) obj).b, ((g8a) obj2).b);
            case 14:
                IntRange intRange = (IntRange) obj;
                IntRange intRange2 = (IntRange) obj2;
                return (intRange.b - intRange.a) - (intRange2.b - intRange2.a);
            case 15:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                dxa dxaVar = LayoutNode.R;
                if (layoutNode.H() == layoutNode2.H()) {
                    return Intrinsics.d(layoutNode.E(), layoutNode2.E());
                }
                return Float.compare(layoutNode.H(), layoutNode2.H());
            case 16:
                return Intrinsics.d(((p1b) obj).getIndex(), ((p1b) obj2).getIndex());
            case 17:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case MlKitException.UNSUPPORTED /* 18 */:
                return ((ow0) obj).a.compareTo(((ow0) obj2).a);
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return RadarSimpleLogBuffer.b((File) obj, (File) obj2);
            case 20:
                return ((z9h) obj).a - ((z9h) obj2).a;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return Float.compare(((z9h) obj).c, ((z9h) obj2).c);
            case 22:
                agh aghVar = (agh) obj;
                agh aghVar2 = (agh) obj2;
                int compare = Integer.compare(aghVar2.b, aghVar.b);
                if (compare == 0) {
                    int compareTo = aghVar.c.compareTo(aghVar2.c);
                    if (compareTo == 0) {
                        return aghVar.d.compareTo(aghVar2.d);
                    }
                    return compareTo;
                }
                return compare;
            case 23:
                agh aghVar3 = (agh) obj;
                agh aghVar4 = (agh) obj2;
                int compare2 = Integer.compare(aghVar4.a, aghVar3.a);
                if (compare2 == 0) {
                    int compareTo2 = aghVar4.c.compareTo(aghVar3.c);
                    if (compareTo2 == 0) {
                        return aghVar4.d.compareTo(aghVar3.d);
                    }
                    return compareTo2;
                }
                return compare2;
            case 24:
                yx0 yx0Var = (yx0) obj2;
                Class cls = ((yx0) obj).a.j;
                if (cls == MediaCodec.class) {
                    i = 2;
                } else if (cls != g3f.class && cls != l0i.class) {
                    i = 1;
                } else {
                    i = 0;
                }
                Class cls2 = yx0Var.a.j;
                if (cls2 == MediaCodec.class) {
                    i2 = 2;
                } else if (cls2 == g3f.class || cls2 == l0i.class) {
                    i2 = 0;
                }
                return i - i2;
            case 25:
                byte[] bArr3 = (byte[]) obj;
                byte[] bArr4 = (byte[]) obj2;
                if (bArr3 != bArr4) {
                    if (bArr3 == null) {
                        return -1;
                    }
                    if (bArr4 == null) {
                        return 1;
                    }
                    for (int i5 = 0; i5 < Math.min(bArr3.length, bArr4.length); i5++) {
                        byte b3 = bArr3[i5];
                        byte b4 = bArr4[i5];
                        if (b3 != b4) {
                            return b3 - b4;
                        }
                    }
                    if (bArr3.length != bArr4.length) {
                        return bArr3.length - bArr4.length;
                    }
                }
                return 0;
            case 26:
                return Integer.compare(((wik) obj).a.b, ((wik) obj2).a.b);
            case 27:
                return Long.compare(((vik) obj).b, ((vik) obj2).b);
            default:
                return nh.a((sa) obj, (sa) obj2);
        }
    }

    public /* synthetic */ tp(int i) {
        this.a = i;
    }
}

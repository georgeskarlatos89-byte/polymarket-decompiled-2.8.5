package skip.foundation;

import defpackage.rx6;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import skip.lib.NumbersKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0004\u001a\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\r\u001a\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0011\u0010\u001a\u001a\u00020\u0002*\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001b*\n\u0010\u0003\"\u00020\u00022\u00020\u0002*\n\u0010\u0014\"\u00020\u00022\u00020\u0002¨\u0006\u001c"}, d2 = {"", AttributeType.NUMBER, "", "DispatchWallTime", "(Ljava/lang/Number;)D", "Lkotlin/UByte;", "DispatchWallTime-7apg3OU", "(B)D", "Lvsj;", "DispatchWallTime-xj2QHRw", "(S)D", "Lkotlin/UInt;", "DispatchWallTime-WZ4Q5Ns", "(I)D", "Lhkj;", "DispatchWallTime-VKZWuLQ", "(J)D", "", "string", "(Ljava/lang/String;)Ljava/lang/Double;", "DispatchTime", "DispatchTime-7apg3OU", "DispatchTime-xj2QHRw", "DispatchTime-WZ4Q5Ns", "DispatchTime-VKZWuLQ", "Lkotlin/Double$Companion;", "now", "(Lrx6;)D", "SkipFoundation"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DispatchKt {
    public static final double DispatchTime(Number number) {
        number.getClass();
        return NumbersKt.Double(number);
    }

    /* renamed from: DispatchTime-7apg3OU, reason: not valid java name */
    public static final double m1078DispatchTime7apg3OU(byte b) {
        return NumbersKt.m1323Double7apg3OU(b);
    }

    /* renamed from: DispatchTime-VKZWuLQ, reason: not valid java name */
    public static final double m1079DispatchTimeVKZWuLQ(long j) {
        return NumbersKt.m1324DoubleVKZWuLQ(j);
    }

    /* renamed from: DispatchTime-WZ4Q5Ns, reason: not valid java name */
    public static final double m1080DispatchTimeWZ4Q5Ns(int i) {
        return NumbersKt.m1325DoubleWZ4Q5Ns(i);
    }

    /* renamed from: DispatchTime-xj2QHRw, reason: not valid java name */
    public static final double m1081DispatchTimexj2QHRw(short s) {
        return NumbersKt.m1326Doublexj2QHRw(s);
    }

    public static final double DispatchWallTime(Number number) {
        number.getClass();
        return NumbersKt.Double(number);
    }

    /* renamed from: DispatchWallTime-7apg3OU, reason: not valid java name */
    public static final double m1082DispatchWallTime7apg3OU(byte b) {
        return NumbersKt.m1323Double7apg3OU(b);
    }

    /* renamed from: DispatchWallTime-VKZWuLQ, reason: not valid java name */
    public static final double m1083DispatchWallTimeVKZWuLQ(long j) {
        return NumbersKt.m1324DoubleVKZWuLQ(j);
    }

    /* renamed from: DispatchWallTime-WZ4Q5Ns, reason: not valid java name */
    public static final double m1084DispatchWallTimeWZ4Q5Ns(int i) {
        return NumbersKt.m1325DoubleWZ4Q5Ns(i);
    }

    /* renamed from: DispatchWallTime-xj2QHRw, reason: not valid java name */
    public static final double m1085DispatchWallTimexj2QHRw(short s) {
        return NumbersKt.m1326Doublexj2QHRw(s);
    }

    public static final double now(rx6 rx6Var) {
        rx6Var.getClass();
        return NumbersKt.Double(Long.valueOf(System.currentTimeMillis())) / 1000.0d;
    }

    public static final Double DispatchTime(String str) {
        str.getClass();
        return NumbersKt.Double(str);
    }

    public static final Double DispatchWallTime(String str) {
        str.getClass();
        return NumbersKt.Double(str);
    }
}

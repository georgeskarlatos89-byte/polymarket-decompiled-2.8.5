package skip.lib;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.rx6;
import defpackage.ww1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Hasher;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 U2\u00020\u0001:\u0001UB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rB)\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u000e\u0012\u0006\u0010\n\u001a\u00020\u000e\u0012\u0006\u0010\u000b\u001a\u00020\u000e\u0012\u0006\u0010\f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fB\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0011J\u000e\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\tJ\u0016\u00108\u001a\u00020\u00002\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\tJ\u000e\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0000J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0000J\u000e\u0010<\u001a\u00020=2\u0006\u0010:\u001a\u00020\u0000J\u000e\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u0003J\u000e\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020\u0000J\b\u0010R\u001a\u00020\u0001H\u0016J\u0013\u0010S\u001a\u00020=2\b\u0010:\u001a\u0004\u0018\u00010GH\u0096\u0002J\b\u0010T\u001a\u00020\u000eH\u0016R&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u0011\u0010!\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0011\u0010#\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0011\u0010%\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u0011\u0010'\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0011\u0010)\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0011\u0010-\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u0010A\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010C\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bC\u0010BR\u0011\u0010D\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bD\u0010BR(\u0010E\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H\u0018\u00010FX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006V"}, d2 = {"Lskip/lib/CGRect;", "Lskip/lib/MutableStruct;", "origin", "Lskip/lib/CGPoint;", "size", "Lskip/lib/CGSize;", "<init>", "(Lskip/lib/CGPoint;Lskip/lib/CGSize;)V", "x", "", "y", "width", "height", "(DDDD)V", "", "(IIII)V", "copy", "(Lskip/lib/MutableStruct;)V", "newValue", "getOrigin", "()Lskip/lib/CGPoint;", "setOrigin", "(Lskip/lib/CGPoint;)V", "getSize", "()Lskip/lib/CGSize;", "setSize", "(Lskip/lib/CGSize;)V", "getHeight", "()D", "setHeight", "(D)V", "getWidth", "setWidth", "minX", "getMinX", "midX", "getMidX", "maxX", "getMaxX", "minY", "getMinY", "midY", "getMidY", "maxY", "getMaxY", "standardized", "getStandardized", "()Lskip/lib/CGRect;", "integral", "getIntegral", "applying", "transform", "Lskip/lib/CGAffineTransform;", "insetBy", "dx", "dy", "offsetBy", "union", "other", PlaceTypes.INTERSECTION, "intersects", "", "contains", "point", "rect", "isEmpty", "()Z", "isInfinite", "isNull", "supdate", "Lkotlin/Function1;", "", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "hashCode", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CGRect implements MutableStruct {
    private static final CGRect infinite;
    private static final CGRect null_;
    private CGPoint origin;
    private CGSize size;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CGRect zero = new CGRect((CGPoint) null, (CGSize) null, 3, (DefaultConstructorMarker) null);

    static {
        rx6 rx6Var = rx6.a;
        null_ = new CGRect(NumbersKt.getInfinity(rx6Var), NumbersKt.getInfinity(rx6Var), ConstantsKt.UNSET, ConstantsKt.UNSET);
        infinite = new CGRect(-8.988465674311579E307d, -8.988465674311579E307d, Double.MAX_VALUE, Double.MAX_VALUE);
    }

    public CGRect(int i, int i2, int i3, int i4) {
        this(new CGPoint(NumbersKt.Double(Integer.valueOf(i)), NumbersKt.Double(Integer.valueOf(i2))), new CGSize(NumbersKt.Double(Integer.valueOf(i3)), NumbersKt.Double(Integer.valueOf(i4))));
    }

    private static final Unit _get_origin_$lambda$0(CGRect cGRect, CGPoint cGPoint) {
        cGPoint.getClass();
        cGRect.setOrigin(cGPoint);
        return Unit.INSTANCE;
    }

    private static final Unit _get_size_$lambda$1(CGRect cGRect, CGSize cGSize) {
        cGSize.getClass();
        cGRect.setSize(cGSize);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(CGRect cGRect, CGSize cGSize) {
        return _get_size_$lambda$1(cGRect, cGSize);
    }

    public static final /* synthetic */ CGRect access$getInfinite$cp() {
        return infinite;
    }

    public static final /* synthetic */ CGRect access$getNull_$cp() {
        return null_;
    }

    public static final /* synthetic */ CGRect access$getZero$cp() {
        return zero;
    }

    public static /* synthetic */ Unit b(CGRect cGRect, CGPoint cGPoint) {
        return _get_origin_$lambda$0(cGRect, cGPoint);
    }

    public final CGRect applying(CGAffineTransform transform) {
        transform.getClass();
        if (!isInfinite() && !isNull()) {
            return new CGRect(getOrigin().applying(transform), getSize().applying(transform));
        }
        return (CGRect) StructKt.sref$default(this, null, 1, null);
    }

    public final boolean contains(CGPoint point) {
        point.getClass();
        CGRect cGRect = (CGRect) StructKt.sref$default(getStandardized(), null, 1, null);
        if (point.getX() >= cGRect.getMinX() && point.getX() <= cGRect.getMaxX() && point.getY() >= cGRect.getMinY() && point.getY() <= cGRect.getMaxY()) {
            return true;
        }
        return false;
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (!(other instanceof CGRect)) {
            return false;
        }
        CGRect cGRect = (CGRect) other;
        if (!Intrinsics.areEqual(getOrigin(), cGRect.getOrigin()) || !Intrinsics.areEqual(getSize(), cGRect.getSize())) {
            return false;
        }
        return true;
    }

    public final double getHeight() {
        return getSize().getHeight();
    }

    public final CGRect getIntegral() {
        if (!isInfinite() && !isNull()) {
            CGRect cGRect = (CGRect) StructKt.sref$default(getStandardized(), null, 1, null);
            return new CGRect(MathKt.floor(cGRect.getMinX()), MathKt.floor(cGRect.getMinY()), MathKt.ceil(cGRect.getWidth()), MathKt.ceil(cGRect.getHeight()));
        }
        return this;
    }

    public final double getMaxX() {
        if (getWidth() >= ConstantsKt.UNSET) {
            return getWidth() + getOrigin().getX();
        }
        return getOrigin().getX();
    }

    public final double getMaxY() {
        if (getHeight() >= ConstantsKt.UNSET) {
            return getHeight() + getOrigin().getY();
        }
        return getOrigin().getY();
    }

    public final double getMidX() {
        return (getMaxX() + getMinX()) / 2.0d;
    }

    public final double getMidY() {
        return (getMaxY() + getMinY()) / 2.0d;
    }

    public final double getMinX() {
        if (getWidth() >= ConstantsKt.UNSET) {
            return getOrigin().getX();
        }
        return getWidth() + getOrigin().getX();
    }

    public final double getMinY() {
        if (getHeight() >= ConstantsKt.UNSET) {
            return getOrigin().getY();
        }
        return getHeight() + getOrigin().getY();
    }

    public final CGPoint getOrigin() {
        return (CGPoint) StructKt.sref(this.origin, new ww1(this, 1));
    }

    public final CGSize getSize() {
        return (CGSize) StructKt.sref(this.size, new ww1(this, 0));
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final CGRect getStandardized() {
        return new CGRect(getMinX(), getMinY(), MathKt.abs(getWidth()), MathKt.abs(getHeight()));
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final double getWidth() {
        return getSize().getWidth();
    }

    public int hashCode() {
        Hasher.Companion companion = Hasher.INSTANCE;
        return companion.combine(companion.combine(1, getOrigin()), getSize());
    }

    public final CGRect insetBy(double dx, double dy) {
        if (!isInfinite() && !isNull()) {
            CGRect cGRect = (CGRect) StructKt.sref$default(getStandardized(), null, 1, null);
            return new CGRect(cGRect.getMinX() + dx, cGRect.getMinY() + dy, cGRect.getWidth() - (dx * 2.0d), cGRect.getHeight() - (dy * 2.0d));
        }
        return (CGRect) StructKt.sref$default(this, null, 1, null);
    }

    public final CGRect intersection(CGRect other) {
        Double valueOf = Double.valueOf(ConstantsKt.UNSET);
        other.getClass();
        if (!other.isEmpty() && !isEmpty()) {
            if (other.isInfinite()) {
                return (CGRect) StructKt.sref$default(this, null, 1, null);
            }
            if (isInfinite()) {
                return (CGRect) StructKt.sref$default(other, null, 1, null);
            }
            CGRect cGRect = (CGRect) StructKt.sref$default(getStandardized(), null, 1, null);
            CGRect cGRect2 = (CGRect) StructKt.sref$default(other.getStandardized(), null, 1, null);
            double doubleValue = ((Number) GlobalsKt.max(Double.valueOf(cGRect.getMinX()), Double.valueOf(cGRect2.getMinX()))).doubleValue();
            double doubleValue2 = ((Number) GlobalsKt.min(Double.valueOf(cGRect.getMaxX()), Double.valueOf(cGRect2.getMaxX()))).doubleValue();
            double doubleValue3 = ((Number) GlobalsKt.max(Double.valueOf(cGRect.getMinY()), Double.valueOf(cGRect2.getMinY()))).doubleValue();
            return new CGRect(doubleValue, doubleValue3, ((Number) GlobalsKt.max(valueOf, Double.valueOf(doubleValue2 - doubleValue))).doubleValue(), ((Number) GlobalsKt.max(valueOf, Double.valueOf(((Number) GlobalsKt.min(Double.valueOf(cGRect.getMaxY()), Double.valueOf(cGRect2.getMaxY()))).doubleValue() - doubleValue3))).doubleValue());
        }
        return (CGRect) StructKt.sref$default(null_, null, 1, null);
    }

    public final boolean intersects(CGRect other) {
        other.getClass();
        return !intersection(other).isEmpty();
    }

    public final boolean isEmpty() {
        if (getWidth() == ConstantsKt.UNSET && getHeight() == ConstantsKt.UNSET) {
            return true;
        }
        return false;
    }

    public final boolean isInfinite() {
        return Intrinsics.areEqual(this, infinite);
    }

    public final boolean isNull() {
        return Intrinsics.areEqual(this, null_);
    }

    public final CGRect offsetBy(double dx, double dy) {
        if (!isInfinite() && !isNull()) {
            CGRect cGRect = (CGRect) StructKt.sref$default(getStandardized(), null, 1, null);
            return new CGRect(cGRect.getMinX() + dx, cGRect.getMinY() + dy, cGRect.getWidth(), cGRect.getHeight());
        }
        return (CGRect) StructKt.sref$default(this, null, 1, null);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new CGRect(this);
    }

    public final void setHeight(double d) {
        getSize().setHeight(d);
    }

    public final void setOrigin(CGPoint cGPoint) {
        cGPoint.getClass();
        CGPoint cGPoint2 = (CGPoint) StructKt.sref$default(cGPoint, null, 1, null);
        willmutate();
        this.origin = cGPoint2;
        didmutate();
    }

    public final void setSize(CGSize cGSize) {
        cGSize.getClass();
        CGSize cGSize2 = (CGSize) StructKt.sref$default(cGSize, null, 1, null);
        willmutate();
        this.size = cGSize2;
        didmutate();
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setWidth(double d) {
        getSize().setWidth(d);
    }

    public final CGRect union(CGRect other) {
        other.getClass();
        if (other.isEmpty()) {
            return (CGRect) StructKt.sref$default(this, null, 1, null);
        }
        if (isEmpty()) {
            return (CGRect) StructKt.sref$default(other, null, 1, null);
        }
        if (!other.isInfinite() && !isInfinite()) {
            CGRect cGRect = (CGRect) StructKt.sref$default(getStandardized(), null, 1, null);
            CGRect cGRect2 = (CGRect) StructKt.sref$default(other.getStandardized(), null, 1, null);
            double doubleValue = ((Number) GlobalsKt.min(Double.valueOf(cGRect.getMinX()), Double.valueOf(cGRect2.getMinX()))).doubleValue();
            double doubleValue2 = ((Number) GlobalsKt.max(Double.valueOf(cGRect.getMaxX()), Double.valueOf(cGRect2.getMaxX()))).doubleValue();
            double doubleValue3 = ((Number) GlobalsKt.min(Double.valueOf(cGRect.getMinY()), Double.valueOf(cGRect2.getMinY()))).doubleValue();
            return new CGRect(doubleValue, doubleValue3, doubleValue2 - doubleValue, ((Number) GlobalsKt.max(Double.valueOf(cGRect.getMaxY()), Double.valueOf(cGRect2.getMaxY()))).doubleValue() - doubleValue3);
        }
        return (CGRect) StructKt.sref$default(infinite, null, 1, null);
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lskip/lib/CGRect$Companion;", "", "<init>", "()V", "zero", "Lskip/lib/CGRect;", "getZero", "()Lskip/lib/CGRect;", "null_", "getNull_", "infinite", "getInfinite", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CGRect getInfinite() {
            return CGRect.access$getInfinite$cp();
        }

        public final CGRect getNull_() {
            return CGRect.access$getNull_$cp();
        }

        public final CGRect getZero() {
            return CGRect.access$getZero$cp();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CGRect(CGPoint cGPoint, CGSize cGSize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CGPoint.INSTANCE.getZero() : cGPoint, (i & 2) != 0 ? CGSize.INSTANCE.getZero() : cGSize);
    }

    public CGRect(double d, double d2, double d3, double d4) {
        this(new CGPoint(d, d2), new CGSize(d3, d4));
    }

    public CGRect(CGPoint cGPoint, CGSize cGSize) {
        cGPoint.getClass();
        cGSize.getClass();
        setOrigin(cGPoint);
        setSize(cGSize);
    }

    private CGRect(MutableStruct mutableStruct) {
        mutableStruct.getClass();
        CGRect cGRect = (CGRect) mutableStruct;
        setOrigin(cGRect.getOrigin());
        setSize(cGRect.getSize());
    }

    public final boolean contains(CGRect rect) {
        rect.getClass();
        return Intrinsics.areEqual(intersection(rect), rect);
    }
}

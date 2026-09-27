package skip.lib;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Hasher;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010!\u001a\u00020\u0001H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010%\u001a\u00020\u001cH\u0016R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lskip/lib/CGPoint;", "Lskip/lib/MutableStruct;", "x", "", "y", "<init>", "(DD)V", "copy", "(Lskip/lib/MutableStruct;)V", "newValue", "getX", "()D", "setX", "(D)V", "getY", "setY", "applying", "transform", "Lskip/lib/CGAffineTransform;", "supdate", "Lkotlin/Function1;", "", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "hashCode", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CGPoint implements MutableStruct {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CGPoint zero = new CGPoint(ConstantsKt.UNSET, ConstantsKt.UNSET, 3, null);
    private int smutatingcount;
    private Function1<Object, Unit> supdate;
    private double x;
    private double y;

    private CGPoint(MutableStruct mutableStruct) {
        mutableStruct.getClass();
        CGPoint cGPoint = (CGPoint) mutableStruct;
        setX(cGPoint.x);
        setY(cGPoint.y);
    }

    public static final /* synthetic */ CGPoint access$getZero$cp() {
        return zero;
    }

    public final CGPoint applying(CGAffineTransform transform) {
        transform.getClass();
        return new CGPoint(transform.getTx() + (transform.getC() * this.y) + (transform.getA() * this.x), transform.getTy() + (transform.getD() * this.y) + (transform.getB() * this.x));
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (!(other instanceof CGPoint)) {
            return false;
        }
        CGPoint cGPoint = (CGPoint) other;
        if (this.x != cGPoint.x || this.y != cGPoint.y) {
            return false;
        }
        return true;
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        Hasher.Companion companion = Hasher.INSTANCE;
        return companion.combine(companion.combine(1, Double.valueOf(this.x)), Double.valueOf(this.y));
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new CGPoint(this);
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setX(double d) {
        willmutate();
        this.x = d;
        didmutate();
    }

    public final void setY(double d) {
        willmutate();
        this.y = d;
        didmutate();
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lskip/lib/CGPoint$Companion;", "", "<init>", "()V", "zero", "Lskip/lib/CGPoint;", "getZero", "()Lskip/lib/CGPoint;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CGPoint getZero() {
            return CGPoint.access$getZero$cp();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CGPoint(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }

    public CGPoint(double d, double d2) {
        setX(d);
        setY(d2);
    }
}

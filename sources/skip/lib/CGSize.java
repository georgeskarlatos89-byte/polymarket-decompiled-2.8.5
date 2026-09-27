package skip.lib;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Hasher;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010!\u001a\u00020\u0001H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010%\u001a\u00020\u001cH\u0016R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lskip/lib/CGSize;", "Lskip/lib/MutableStruct;", "width", "", "height", "<init>", "(DD)V", "copy", "(Lskip/lib/MutableStruct;)V", "newValue", "getWidth", "()D", "setWidth", "(D)V", "getHeight", "setHeight", "applying", "transform", "Lskip/lib/CGAffineTransform;", "supdate", "Lkotlin/Function1;", "", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "hashCode", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CGSize implements MutableStruct {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CGSize zero = new CGSize(ConstantsKt.UNSET, ConstantsKt.UNSET, 3, null);
    private double height;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;
    private double width;

    private CGSize(MutableStruct mutableStruct) {
        mutableStruct.getClass();
        CGSize cGSize = (CGSize) mutableStruct;
        setWidth(cGSize.width);
        setHeight(cGSize.height);
    }

    public static final /* synthetic */ CGSize access$getZero$cp() {
        return zero;
    }

    public final CGSize applying(CGAffineTransform transform) {
        transform.getClass();
        return new CGSize((transform.getC() * this.height) + (transform.getA() * this.width), (transform.getD() * this.height) + (transform.getB() * this.width));
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (!(other instanceof CGSize)) {
            return false;
        }
        CGSize cGSize = (CGSize) other;
        if (this.width != cGSize.width || this.height != cGSize.height) {
            return false;
        }
        return true;
    }

    public final double getHeight() {
        return this.height;
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final double getWidth() {
        return this.width;
    }

    public int hashCode() {
        Hasher.Companion companion = Hasher.INSTANCE;
        return companion.combine(companion.combine(1, Double.valueOf(this.width)), Double.valueOf(this.height));
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new CGSize(this);
    }

    public final void setHeight(double d) {
        willmutate();
        this.height = d;
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
        willmutate();
        this.width = d;
        didmutate();
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lskip/lib/CGSize$Companion;", "", "<init>", "()V", "zero", "Lskip/lib/CGSize;", "getZero", "()Lskip/lib/CGSize;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CGSize getZero() {
            return CGSize.access$getZero$cp();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CGSize(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }

    public CGSize(double d, double d2) {
        setWidth(d);
        setHeight(d2);
    }
}

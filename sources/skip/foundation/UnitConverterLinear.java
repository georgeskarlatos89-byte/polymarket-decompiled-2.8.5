package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.izi;
import defpackage.xyi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import skip.lib.Hasher;
import skip.lib.InOut;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lskip/foundation/UnitConverterLinear;", "Lskip/foundation/UnitConverter;", "coefficient", "", "constant", "<init>", "(DD)V", "getCoefficient", "()D", "getConstant", "baseUnitValue", "fromValue", "value", "fromBaseUnitValue", "equals", "", "other", "", "hashCode", "", "hash", "", "into", "Lskip/lib/InOut;", "Lskip/lib/Hasher;", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnitConverterLinear extends UnitConverter {
    private final double coefficient;
    private final double constant;

    public /* synthetic */ UnitConverterLinear(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, (i & 2) != 0 ? ConstantsKt.UNSET : d2);
    }

    public static /* synthetic */ Unit a(Ref.ObjectRef objectRef, Hasher hasher) {
        return hashCode$lambda$1(objectRef, hasher);
    }

    public static /* synthetic */ Hasher b(Ref.ObjectRef objectRef) {
        return hashCode$lambda$0(objectRef);
    }

    private static final Hasher hashCode$lambda$0(Ref.ObjectRef objectRef) {
        return (Hasher) objectRef.a;
    }

    private static final Unit hashCode$lambda$1(Ref.ObjectRef objectRef, Hasher hasher) {
        hasher.getClass();
        objectRef.a = hasher;
        return Unit.INSTANCE;
    }

    @Override // skip.foundation.UnitConverter
    public double baseUnitValue(double fromValue) {
        return (fromValue * this.coefficient) + this.constant;
    }

    public boolean equals(Object other) {
        if (!(other instanceof UnitConverterLinear)) {
            return false;
        }
        UnitConverterLinear unitConverterLinear = (UnitConverterLinear) other;
        if (this.coefficient != unitConverterLinear.coefficient || this.constant != unitConverterLinear.constant) {
            return false;
        }
        return true;
    }

    public final double getCoefficient() {
        return this.coefficient;
    }

    public final double getConstant() {
        return this.constant;
    }

    public final void hash(InOut<Hasher> into) {
        into.getClass();
        into.getValue().combine(Double.valueOf(this.coefficient));
        into.getValue().combine(Double.valueOf(this.constant));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public int hashCode() {
        ?? obj = new Object();
        obj.a = new Hasher();
        hash(new InOut<>(new xyi(obj, 3), new izi(obj, 8)));
        return ((Hasher) obj.a).getResult();
    }

    @Override // skip.foundation.UnitConverter
    public double value(double fromBaseUnitValue) {
        return (fromBaseUnitValue - this.constant) / this.coefficient;
    }

    public UnitConverterLinear(double d, double d2) {
        this.coefficient = d;
        this.constant = d2;
    }
}

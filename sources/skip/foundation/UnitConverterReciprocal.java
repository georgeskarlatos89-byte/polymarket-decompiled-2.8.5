package skip.foundation;

import defpackage.izi;
import defpackage.xyi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import skip.lib.Hasher;
import skip.lib.InOut;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lskip/foundation/UnitConverterReciprocal;", "Lskip/foundation/UnitConverter;", "reciprocal", "", "<init>", "(D)V", "getReciprocal", "()D", "baseUnitValue", "fromValue", "value", "fromBaseUnitValue", "equals", "", "other", "", "hashCode", "", "hash", "", "into", "Lskip/lib/InOut;", "Lskip/lib/Hasher;", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnitConverterReciprocal extends UnitConverter {
    private final double reciprocal;

    public UnitConverterReciprocal(double d) {
        this.reciprocal = d;
    }

    public static /* synthetic */ Hasher a(Ref.ObjectRef objectRef) {
        return hashCode$lambda$0(objectRef);
    }

    public static /* synthetic */ Unit b(Ref.ObjectRef objectRef, Hasher hasher) {
        return hashCode$lambda$1(objectRef, hasher);
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
        return this.reciprocal / fromValue;
    }

    public boolean equals(Object other) {
        if (!(other instanceof UnitConverterReciprocal) || this.reciprocal != ((UnitConverterReciprocal) other).reciprocal) {
            return false;
        }
        return true;
    }

    public final double getReciprocal() {
        return this.reciprocal;
    }

    public final void hash(InOut<Hasher> into) {
        into.getClass();
        into.getValue().combine(Double.valueOf(this.reciprocal));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public int hashCode() {
        ?? obj = new Object();
        obj.a = new Hasher();
        hash(new InOut<>(new xyi(obj, 4), new izi(obj, 9)));
        return ((Hasher) obj.a).getResult();
    }

    @Override // skip.foundation.UnitConverter
    public double value(double fromBaseUnitValue) {
        return this.reciprocal / fromBaseUnitValue;
    }
}

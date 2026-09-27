package skip.foundation;

import defpackage.m51;
import defpackage.pc0;
import defpackage.qc0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import skip.foundation.FoundationUnit;
import skip.lib.GlobalsKt;
import skip.lib.Hasher;
import skip.lib.InOut;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lskip/foundation/Dimension;", "Lskip/foundation/FoundationUnit;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "getConverter", "()Lskip/foundation/UnitConverter;", "equals", "", "other", "", "hashCode", "", "hash", "", "into", "Lskip/lib/InOut;", "Lskip/lib/Hasher;", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Dimension extends FoundationUnit {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final UnitConverter converter;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lskip/foundation/Dimension$CompanionClass;", "Lskip/foundation/FoundationUnit$CompanionClass;", "<init>", "()V", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends FoundationUnit.CompanionClass {
        public Dimension baseUnit() {
            return Dimension.INSTANCE.baseUnit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dimension(String str, UnitConverter unitConverter) {
        super(str);
        str.getClass();
        unitConverter.getClass();
        this.converter = unitConverter;
    }

    public static /* synthetic */ Unit c(Ref.ObjectRef objectRef, Hasher hasher) {
        return hashCode$lambda$5(objectRef, hasher);
    }

    public static /* synthetic */ Hasher d(Ref.ObjectRef objectRef) {
        return hashCode$lambda$4(objectRef);
    }

    private static final Hasher hashCode$lambda$4(Ref.ObjectRef objectRef) {
        return (Hasher) objectRef.a;
    }

    private static final Unit hashCode$lambda$5(Ref.ObjectRef objectRef, Hasher hasher) {
        hasher.getClass();
        objectRef.a = hasher;
        return Unit.INSTANCE;
    }

    @Override // skip.foundation.FoundationUnit
    public boolean equals(Object other) {
        UnitConverterLinear unitConverterLinear;
        UnitConverterReciprocal unitConverterReciprocal;
        UnitConverterLinear unitConverterLinear2;
        if (!(other instanceof Dimension)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(GlobalsKt.type(this), GlobalsKt.type(other))) {
            return false;
        }
        Dimension dimension = (Dimension) other;
        if (!Intrinsics.areEqual(getSymbol(), dimension.getSymbol())) {
            return false;
        }
        UnitConverter unitConverter = this.converter;
        UnitConverterReciprocal unitConverterReciprocal2 = null;
        if (unitConverter instanceof UnitConverterLinear) {
            unitConverterLinear = (UnitConverterLinear) unitConverter;
        } else {
            unitConverterLinear = null;
        }
        if (unitConverterLinear != null) {
            UnitConverter unitConverter2 = dimension.converter;
            if (unitConverter2 instanceof UnitConverterLinear) {
                unitConverterLinear2 = (UnitConverterLinear) unitConverter2;
            } else {
                unitConverterLinear2 = null;
            }
            if (unitConverterLinear2 != null) {
                return Intrinsics.areEqual(unitConverterLinear, unitConverterLinear2);
            }
        }
        if (unitConverter instanceof UnitConverterReciprocal) {
            unitConverterReciprocal = (UnitConverterReciprocal) unitConverter;
        } else {
            unitConverterReciprocal = null;
        }
        if (unitConverterReciprocal != null) {
            UnitConverter unitConverter3 = dimension.converter;
            if (unitConverter3 instanceof UnitConverterReciprocal) {
                unitConverterReciprocal2 = (UnitConverterReciprocal) unitConverter3;
            }
            if (unitConverterReciprocal2 != null) {
                return Intrinsics.areEqual(unitConverterReciprocal, unitConverterReciprocal2);
            }
        }
        return false;
    }

    public final UnitConverter getConverter() {
        return this.converter;
    }

    @Override // skip.foundation.FoundationUnit
    public void hash(InOut<Hasher> into) {
        UnitConverterLinear unitConverterLinear;
        into.getClass();
        into.getValue().combine(getSymbol());
        UnitConverter unitConverter = this.converter;
        UnitConverterReciprocal unitConverterReciprocal = null;
        if (unitConverter instanceof UnitConverterLinear) {
            unitConverterLinear = (UnitConverterLinear) unitConverter;
        } else {
            unitConverterLinear = null;
        }
        if (unitConverterLinear != null) {
            into.getValue().combine(unitConverterLinear);
            return;
        }
        if (unitConverter instanceof UnitConverterReciprocal) {
            unitConverterReciprocal = (UnitConverterReciprocal) unitConverter;
        }
        if (unitConverterReciprocal != null) {
            into.getValue().combine(unitConverterReciprocal);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    @Override // skip.foundation.FoundationUnit
    public int hashCode() {
        ?? obj = new Object();
        obj.a = new Hasher();
        hash(new InOut<>(new pc0(obj, 12), new qc0(obj, 9)));
        return ((Hasher) obj.a).getResult();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lskip/foundation/Dimension$Companion;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            throw m51.B("Subclass must override baseUnit()");
        }

        private Companion() {
        }
    }
}

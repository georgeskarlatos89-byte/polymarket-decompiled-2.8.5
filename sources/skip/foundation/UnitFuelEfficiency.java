package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitFuelEfficiency;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitFuelEfficiency extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitFuelEfficiency litersPer100Kilometers = new UnitFuelEfficiency("L/100km", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitFuelEfficiency milesPerImperialGallon = new UnitFuelEfficiency("mpg", new UnitConverterReciprocal(282.481d));
    private static final UnitFuelEfficiency milesPerGallon = new UnitFuelEfficiency("mpg", new UnitConverterReciprocal(235.215d));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lskip/foundation/UnitFuelEfficiency$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "litersPer100Kilometers", "Lskip/foundation/UnitFuelEfficiency;", "getLitersPer100Kilometers", "()Lskip/foundation/UnitFuelEfficiency;", "milesPerImperialGallon", "getMilesPerImperialGallon", "milesPerGallon", "getMilesPerGallon", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitFuelEfficiency.INSTANCE.baseUnit();
        }

        public UnitFuelEfficiency getLitersPer100Kilometers() {
            return UnitFuelEfficiency.INSTANCE.getLitersPer100Kilometers();
        }

        public UnitFuelEfficiency getMilesPerGallon() {
            return UnitFuelEfficiency.INSTANCE.getMilesPerGallon();
        }

        public UnitFuelEfficiency getMilesPerImperialGallon() {
            return UnitFuelEfficiency.INSTANCE.getMilesPerImperialGallon();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitFuelEfficiency(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitFuelEfficiency access$getLitersPer100Kilometers$cp() {
        return litersPer100Kilometers;
    }

    public static final /* synthetic */ UnitFuelEfficiency access$getMilesPerGallon$cp() {
        return milesPerGallon;
    }

    public static final /* synthetic */ UnitFuelEfficiency access$getMilesPerImperialGallon$cp() {
        return milesPerImperialGallon;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lskip/foundation/UnitFuelEfficiency$Companion;", "Lskip/foundation/UnitFuelEfficiency$CompanionClass;", "<init>", "()V", "litersPer100Kilometers", "Lskip/foundation/UnitFuelEfficiency;", "getLitersPer100Kilometers", "()Lskip/foundation/UnitFuelEfficiency;", "milesPerImperialGallon", "getMilesPerImperialGallon", "milesPerGallon", "getMilesPerGallon", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitFuelEfficiency.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getLitersPer100Kilometers();
        }

        @Override // skip.foundation.UnitFuelEfficiency.CompanionClass
        public UnitFuelEfficiency getLitersPer100Kilometers() {
            return UnitFuelEfficiency.access$getLitersPer100Kilometers$cp();
        }

        @Override // skip.foundation.UnitFuelEfficiency.CompanionClass
        public UnitFuelEfficiency getMilesPerGallon() {
            return UnitFuelEfficiency.access$getMilesPerGallon$cp();
        }

        @Override // skip.foundation.UnitFuelEfficiency.CompanionClass
        public UnitFuelEfficiency getMilesPerImperialGallon() {
            return UnitFuelEfficiency.access$getMilesPerImperialGallon$cp();
        }

        private Companion() {
        }
    }
}

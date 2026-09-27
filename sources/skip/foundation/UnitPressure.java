package skip.foundation;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitPressure;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitPressure extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitPressure newtonsPerMetersSquared = new UnitPressure("N/m²", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitPressure gigapascals = new UnitPressure("GPa", new UnitConverterLinear(1.0E9d, ConstantsKt.UNSET, 2, null));
    private static final UnitPressure megapascals = new UnitPressure("MPa", new UnitConverterLinear(1000000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitPressure kilopascals = new UnitPressure("kPa", new UnitConverterLinear(1000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitPressure hectopascals = new UnitPressure("hPa", new UnitConverterLinear(100.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitPressure inchesOfMercury = new UnitPressure("inHg", new UnitConverterLinear(3386.39d, ConstantsKt.UNSET, 2, null));
    private static final UnitPressure bars = new UnitPressure(PlaceTypes.BAR, new UnitConverterLinear(100000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitPressure millibars = new UnitPressure("mbar", new UnitConverterLinear(100.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitPressure millimetersOfMercury = new UnitPressure("mmHg", new UnitConverterLinear(133.322d, ConstantsKt.UNSET, 2, null));
    private static final UnitPressure poundsForcePerSquareInch = new UnitPressure("psi", new UnitConverterLinear(6894.76d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"Lskip/foundation/UnitPressure$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "newtonsPerMetersSquared", "Lskip/foundation/UnitPressure;", "getNewtonsPerMetersSquared", "()Lskip/foundation/UnitPressure;", "gigapascals", "getGigapascals", "megapascals", "getMegapascals", "kilopascals", "getKilopascals", "hectopascals", "getHectopascals", "inchesOfMercury", "getInchesOfMercury", "bars", "getBars", "millibars", "getMillibars", "millimetersOfMercury", "getMillimetersOfMercury", "poundsForcePerSquareInch", "getPoundsForcePerSquareInch", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitPressure.INSTANCE.baseUnit();
        }

        public UnitPressure getBars() {
            return UnitPressure.INSTANCE.getBars();
        }

        public UnitPressure getGigapascals() {
            return UnitPressure.INSTANCE.getGigapascals();
        }

        public UnitPressure getHectopascals() {
            return UnitPressure.INSTANCE.getHectopascals();
        }

        public UnitPressure getInchesOfMercury() {
            return UnitPressure.INSTANCE.getInchesOfMercury();
        }

        public UnitPressure getKilopascals() {
            return UnitPressure.INSTANCE.getKilopascals();
        }

        public UnitPressure getMegapascals() {
            return UnitPressure.INSTANCE.getMegapascals();
        }

        public UnitPressure getMillibars() {
            return UnitPressure.INSTANCE.getMillibars();
        }

        public UnitPressure getMillimetersOfMercury() {
            return UnitPressure.INSTANCE.getMillimetersOfMercury();
        }

        public UnitPressure getNewtonsPerMetersSquared() {
            return UnitPressure.INSTANCE.getNewtonsPerMetersSquared();
        }

        public UnitPressure getPoundsForcePerSquareInch() {
            return UnitPressure.INSTANCE.getPoundsForcePerSquareInch();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitPressure(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitPressure access$getBars$cp() {
        return bars;
    }

    public static final /* synthetic */ UnitPressure access$getGigapascals$cp() {
        return gigapascals;
    }

    public static final /* synthetic */ UnitPressure access$getHectopascals$cp() {
        return hectopascals;
    }

    public static final /* synthetic */ UnitPressure access$getInchesOfMercury$cp() {
        return inchesOfMercury;
    }

    public static final /* synthetic */ UnitPressure access$getKilopascals$cp() {
        return kilopascals;
    }

    public static final /* synthetic */ UnitPressure access$getMegapascals$cp() {
        return megapascals;
    }

    public static final /* synthetic */ UnitPressure access$getMillibars$cp() {
        return millibars;
    }

    public static final /* synthetic */ UnitPressure access$getMillimetersOfMercury$cp() {
        return millimetersOfMercury;
    }

    public static final /* synthetic */ UnitPressure access$getNewtonsPerMetersSquared$cp() {
        return newtonsPerMetersSquared;
    }

    public static final /* synthetic */ UnitPressure access$getPoundsForcePerSquareInch$cp() {
        return poundsForcePerSquareInch;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"Lskip/foundation/UnitPressure$Companion;", "Lskip/foundation/UnitPressure$CompanionClass;", "<init>", "()V", "newtonsPerMetersSquared", "Lskip/foundation/UnitPressure;", "getNewtonsPerMetersSquared", "()Lskip/foundation/UnitPressure;", "gigapascals", "getGigapascals", "megapascals", "getMegapascals", "kilopascals", "getKilopascals", "hectopascals", "getHectopascals", "inchesOfMercury", "getInchesOfMercury", "bars", "getBars", "millibars", "getMillibars", "millimetersOfMercury", "getMillimetersOfMercury", "poundsForcePerSquareInch", "getPoundsForcePerSquareInch", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getNewtonsPerMetersSquared();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass
        public UnitPressure getBars() {
            return UnitPressure.access$getBars$cp();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass
        public UnitPressure getGigapascals() {
            return UnitPressure.access$getGigapascals$cp();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass
        public UnitPressure getHectopascals() {
            return UnitPressure.access$getHectopascals$cp();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass
        public UnitPressure getInchesOfMercury() {
            return UnitPressure.access$getInchesOfMercury$cp();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass
        public UnitPressure getKilopascals() {
            return UnitPressure.access$getKilopascals$cp();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass
        public UnitPressure getMegapascals() {
            return UnitPressure.access$getMegapascals$cp();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass
        public UnitPressure getMillibars() {
            return UnitPressure.access$getMillibars$cp();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass
        public UnitPressure getMillimetersOfMercury() {
            return UnitPressure.access$getMillimetersOfMercury$cp();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass
        public UnitPressure getNewtonsPerMetersSquared() {
            return UnitPressure.access$getNewtonsPerMetersSquared$cp();
        }

        @Override // skip.foundation.UnitPressure.CompanionClass
        public UnitPressure getPoundsForcePerSquareInch() {
            return UnitPressure.access$getPoundsForcePerSquareInch$cp();
        }

        private Companion() {
        }
    }
}

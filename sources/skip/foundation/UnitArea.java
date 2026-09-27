package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitArea;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitArea extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitArea squareMegameters = new UnitArea("Mm²", new UnitConverterLinear(1.0E12d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea squareKilometers = new UnitArea("km²", new UnitConverterLinear(1000000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea squareMeters = new UnitArea("m²", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea squareCentimeters = new UnitArea("cm²", new UnitConverterLinear(1.0E-4d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea squareMillimeters = new UnitArea("mm²", new UnitConverterLinear(1.0E-6d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea squareMicrometers = new UnitArea("µm²", new UnitConverterLinear(1.0E-12d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea squareNanometers = new UnitArea("nm²", new UnitConverterLinear(1.0E-18d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea squareInches = new UnitArea("in²", new UnitConverterLinear(6.4516E-4d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea squareFeet = new UnitArea("ft²", new UnitConverterLinear(0.092903d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea squareYards = new UnitArea("yd²", new UnitConverterLinear(0.836127d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea squareMiles = new UnitArea("mi²", new UnitConverterLinear(2590000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea acres = new UnitArea("ac", new UnitConverterLinear(4046.86d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea ares = new UnitArea("a", new UnitConverterLinear(100.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitArea hectares = new UnitArea("ha", new UnitConverterLinear(10000.0d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0007¨\u0006$"}, d2 = {"Lskip/foundation/UnitArea$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "squareMegameters", "Lskip/foundation/UnitArea;", "getSquareMegameters", "()Lskip/foundation/UnitArea;", "squareKilometers", "getSquareKilometers", "squareMeters", "getSquareMeters", "squareCentimeters", "getSquareCentimeters", "squareMillimeters", "getSquareMillimeters", "squareMicrometers", "getSquareMicrometers", "squareNanometers", "getSquareNanometers", "squareInches", "getSquareInches", "squareFeet", "getSquareFeet", "squareYards", "getSquareYards", "squareMiles", "getSquareMiles", "acres", "getAcres", "ares", "getAres", "hectares", "getHectares", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitArea.INSTANCE.baseUnit();
        }

        public UnitArea getAcres() {
            return UnitArea.INSTANCE.getAcres();
        }

        public UnitArea getAres() {
            return UnitArea.INSTANCE.getAres();
        }

        public UnitArea getHectares() {
            return UnitArea.INSTANCE.getHectares();
        }

        public UnitArea getSquareCentimeters() {
            return UnitArea.INSTANCE.getSquareCentimeters();
        }

        public UnitArea getSquareFeet() {
            return UnitArea.INSTANCE.getSquareFeet();
        }

        public UnitArea getSquareInches() {
            return UnitArea.INSTANCE.getSquareInches();
        }

        public UnitArea getSquareKilometers() {
            return UnitArea.INSTANCE.getSquareKilometers();
        }

        public UnitArea getSquareMegameters() {
            return UnitArea.INSTANCE.getSquareMegameters();
        }

        public UnitArea getSquareMeters() {
            return UnitArea.INSTANCE.getSquareMeters();
        }

        public UnitArea getSquareMicrometers() {
            return UnitArea.INSTANCE.getSquareMicrometers();
        }

        public UnitArea getSquareMiles() {
            return UnitArea.INSTANCE.getSquareMiles();
        }

        public UnitArea getSquareMillimeters() {
            return UnitArea.INSTANCE.getSquareMillimeters();
        }

        public UnitArea getSquareNanometers() {
            return UnitArea.INSTANCE.getSquareNanometers();
        }

        public UnitArea getSquareYards() {
            return UnitArea.INSTANCE.getSquareYards();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitArea(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitArea access$getAcres$cp() {
        return acres;
    }

    public static final /* synthetic */ UnitArea access$getAres$cp() {
        return ares;
    }

    public static final /* synthetic */ UnitArea access$getHectares$cp() {
        return hectares;
    }

    public static final /* synthetic */ UnitArea access$getSquareCentimeters$cp() {
        return squareCentimeters;
    }

    public static final /* synthetic */ UnitArea access$getSquareFeet$cp() {
        return squareFeet;
    }

    public static final /* synthetic */ UnitArea access$getSquareInches$cp() {
        return squareInches;
    }

    public static final /* synthetic */ UnitArea access$getSquareKilometers$cp() {
        return squareKilometers;
    }

    public static final /* synthetic */ UnitArea access$getSquareMegameters$cp() {
        return squareMegameters;
    }

    public static final /* synthetic */ UnitArea access$getSquareMeters$cp() {
        return squareMeters;
    }

    public static final /* synthetic */ UnitArea access$getSquareMicrometers$cp() {
        return squareMicrometers;
    }

    public static final /* synthetic */ UnitArea access$getSquareMiles$cp() {
        return squareMiles;
    }

    public static final /* synthetic */ UnitArea access$getSquareMillimeters$cp() {
        return squareMillimeters;
    }

    public static final /* synthetic */ UnitArea access$getSquareNanometers$cp() {
        return squareNanometers;
    }

    public static final /* synthetic */ UnitArea access$getSquareYards$cp() {
        return squareYards;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007¨\u0006$"}, d2 = {"Lskip/foundation/UnitArea$Companion;", "Lskip/foundation/UnitArea$CompanionClass;", "<init>", "()V", "squareMegameters", "Lskip/foundation/UnitArea;", "getSquareMegameters", "()Lskip/foundation/UnitArea;", "squareKilometers", "getSquareKilometers", "squareMeters", "getSquareMeters", "squareCentimeters", "getSquareCentimeters", "squareMillimeters", "getSquareMillimeters", "squareMicrometers", "getSquareMicrometers", "squareNanometers", "getSquareNanometers", "squareInches", "getSquareInches", "squareFeet", "getSquareFeet", "squareYards", "getSquareYards", "squareMiles", "getSquareMiles", "acres", "getAcres", "ares", "getAres", "hectares", "getHectares", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitArea.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getSquareMeters();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getAcres() {
            return UnitArea.access$getAcres$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getAres() {
            return UnitArea.access$getAres$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getHectares() {
            return UnitArea.access$getHectares$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareCentimeters() {
            return UnitArea.access$getSquareCentimeters$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareFeet() {
            return UnitArea.access$getSquareFeet$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareInches() {
            return UnitArea.access$getSquareInches$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareKilometers() {
            return UnitArea.access$getSquareKilometers$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareMegameters() {
            return UnitArea.access$getSquareMegameters$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareMeters() {
            return UnitArea.access$getSquareMeters$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareMicrometers() {
            return UnitArea.access$getSquareMicrometers$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareMiles() {
            return UnitArea.access$getSquareMiles$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareMillimeters() {
            return UnitArea.access$getSquareMillimeters$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareNanometers() {
            return UnitArea.access$getSquareNanometers$cp();
        }

        @Override // skip.foundation.UnitArea.CompanionClass
        public UnitArea getSquareYards() {
            return UnitArea.access$getSquareYards$cp();
        }

        private Companion() {
        }
    }
}

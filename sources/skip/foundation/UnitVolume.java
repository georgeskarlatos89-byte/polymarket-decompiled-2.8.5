package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitVolume;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitVolume extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitVolume megaliters = new UnitVolume("ML", new UnitConverterLinear(1000000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume kiloliters = new UnitVolume("kL", new UnitConverterLinear(1000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume liters = new UnitVolume("L", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume deciliters = new UnitVolume("dL", new UnitConverterLinear(0.1d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume centiliters = new UnitVolume("cL", new UnitConverterLinear(0.01d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume milliliters = new UnitVolume("mL", new UnitConverterLinear(0.001d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume cubicKilometers = new UnitVolume("km³", new UnitConverterLinear(1.0E12d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume cubicMeters = new UnitVolume("m³", new UnitConverterLinear(1000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume cubicDecimeters = new UnitVolume("dm³", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume cubicCentimeters = new UnitVolume("cm³", new UnitConverterLinear(0.001d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume cubicMillimeters = new UnitVolume("mm³", new UnitConverterLinear(1.0E-6d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume cubicInches = new UnitVolume("in³", new UnitConverterLinear(0.0163871d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume cubicFeet = new UnitVolume("ft³", new UnitConverterLinear(28.3168d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume cubicYards = new UnitVolume("yd³", new UnitConverterLinear(764.555d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume cubicMiles = new UnitVolume("mi³", new UnitConverterLinear(4.168E12d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume acreFeet = new UnitVolume("af", new UnitConverterLinear(1233000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume bushels = new UnitVolume("bsh", new UnitConverterLinear(35.2391d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume teaspoons = new UnitVolume("tsp", new UnitConverterLinear(0.00492892d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume tablespoons = new UnitVolume("tbsp", new UnitConverterLinear(0.0147868d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume fluidOunces = new UnitVolume("fl oz", new UnitConverterLinear(0.0295735d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume cups = new UnitVolume("cup", new UnitConverterLinear(0.24d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume pints = new UnitVolume("pt", new UnitConverterLinear(0.473176d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume quarts = new UnitVolume("qt", new UnitConverterLinear(0.946353d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume gallons = new UnitVolume("gal", new UnitConverterLinear(3.78541d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume imperialTeaspoons = new UnitVolume("tsp", new UnitConverterLinear(0.00591939d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume imperialTablespoons = new UnitVolume("tbsp", new UnitConverterLinear(0.0177582d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume imperialFluidOunces = new UnitVolume("fl oz", new UnitConverterLinear(0.0284131d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume imperialPints = new UnitVolume("pt", new UnitConverterLinear(0.568261d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume imperialQuarts = new UnitVolume("qt", new UnitConverterLinear(1.13652d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume imperialGallons = new UnitVolume("gal", new UnitConverterLinear(4.54609d, ConstantsKt.UNSET, 2, null));
    private static final UnitVolume metricCups = new UnitVolume("metric cup", new UnitConverterLinear(0.25d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010D\u001a\u00020EH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u0014\u00102\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0007R\u0014\u00104\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0007R\u0014\u00106\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0007R\u0014\u00108\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0007R\u0014\u0010:\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0007R\u0014\u0010<\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0007R\u0014\u0010>\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0007R\u0014\u0010@\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0007R\u0014\u0010B\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0007¨\u0006F"}, d2 = {"Lskip/foundation/UnitVolume$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "megaliters", "Lskip/foundation/UnitVolume;", "getMegaliters", "()Lskip/foundation/UnitVolume;", "kiloliters", "getKiloliters", "liters", "getLiters", "deciliters", "getDeciliters", "centiliters", "getCentiliters", "milliliters", "getMilliliters", "cubicKilometers", "getCubicKilometers", "cubicMeters", "getCubicMeters", "cubicDecimeters", "getCubicDecimeters", "cubicCentimeters", "getCubicCentimeters", "cubicMillimeters", "getCubicMillimeters", "cubicInches", "getCubicInches", "cubicFeet", "getCubicFeet", "cubicYards", "getCubicYards", "cubicMiles", "getCubicMiles", "acreFeet", "getAcreFeet", "bushels", "getBushels", "teaspoons", "getTeaspoons", "tablespoons", "getTablespoons", "fluidOunces", "getFluidOunces", "cups", "getCups", "pints", "getPints", "quarts", "getQuarts", "gallons", "getGallons", "imperialTeaspoons", "getImperialTeaspoons", "imperialTablespoons", "getImperialTablespoons", "imperialFluidOunces", "getImperialFluidOunces", "imperialPints", "getImperialPints", "imperialQuarts", "getImperialQuarts", "imperialGallons", "getImperialGallons", "metricCups", "getMetricCups", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitVolume.INSTANCE.baseUnit();
        }

        public UnitVolume getAcreFeet() {
            return UnitVolume.INSTANCE.getAcreFeet();
        }

        public UnitVolume getBushels() {
            return UnitVolume.INSTANCE.getBushels();
        }

        public UnitVolume getCentiliters() {
            return UnitVolume.INSTANCE.getCentiliters();
        }

        public UnitVolume getCubicCentimeters() {
            return UnitVolume.INSTANCE.getCubicCentimeters();
        }

        public UnitVolume getCubicDecimeters() {
            return UnitVolume.INSTANCE.getCubicDecimeters();
        }

        public UnitVolume getCubicFeet() {
            return UnitVolume.INSTANCE.getCubicFeet();
        }

        public UnitVolume getCubicInches() {
            return UnitVolume.INSTANCE.getCubicInches();
        }

        public UnitVolume getCubicKilometers() {
            return UnitVolume.INSTANCE.getCubicKilometers();
        }

        public UnitVolume getCubicMeters() {
            return UnitVolume.INSTANCE.getCubicMeters();
        }

        public UnitVolume getCubicMiles() {
            return UnitVolume.INSTANCE.getCubicMiles();
        }

        public UnitVolume getCubicMillimeters() {
            return UnitVolume.INSTANCE.getCubicMillimeters();
        }

        public UnitVolume getCubicYards() {
            return UnitVolume.INSTANCE.getCubicYards();
        }

        public UnitVolume getCups() {
            return UnitVolume.INSTANCE.getCups();
        }

        public UnitVolume getDeciliters() {
            return UnitVolume.INSTANCE.getDeciliters();
        }

        public UnitVolume getFluidOunces() {
            return UnitVolume.INSTANCE.getFluidOunces();
        }

        public UnitVolume getGallons() {
            return UnitVolume.INSTANCE.getGallons();
        }

        public UnitVolume getImperialFluidOunces() {
            return UnitVolume.INSTANCE.getImperialFluidOunces();
        }

        public UnitVolume getImperialGallons() {
            return UnitVolume.INSTANCE.getImperialGallons();
        }

        public UnitVolume getImperialPints() {
            return UnitVolume.INSTANCE.getImperialPints();
        }

        public UnitVolume getImperialQuarts() {
            return UnitVolume.INSTANCE.getImperialQuarts();
        }

        public UnitVolume getImperialTablespoons() {
            return UnitVolume.INSTANCE.getImperialTablespoons();
        }

        public UnitVolume getImperialTeaspoons() {
            return UnitVolume.INSTANCE.getImperialTeaspoons();
        }

        public UnitVolume getKiloliters() {
            return UnitVolume.INSTANCE.getKiloliters();
        }

        public UnitVolume getLiters() {
            return UnitVolume.INSTANCE.getLiters();
        }

        public UnitVolume getMegaliters() {
            return UnitVolume.INSTANCE.getMegaliters();
        }

        public UnitVolume getMetricCups() {
            return UnitVolume.INSTANCE.getMetricCups();
        }

        public UnitVolume getMilliliters() {
            return UnitVolume.INSTANCE.getMilliliters();
        }

        public UnitVolume getPints() {
            return UnitVolume.INSTANCE.getPints();
        }

        public UnitVolume getQuarts() {
            return UnitVolume.INSTANCE.getQuarts();
        }

        public UnitVolume getTablespoons() {
            return UnitVolume.INSTANCE.getTablespoons();
        }

        public UnitVolume getTeaspoons() {
            return UnitVolume.INSTANCE.getTeaspoons();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitVolume(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitVolume access$getAcreFeet$cp() {
        return acreFeet;
    }

    public static final /* synthetic */ UnitVolume access$getBushels$cp() {
        return bushels;
    }

    public static final /* synthetic */ UnitVolume access$getCentiliters$cp() {
        return centiliters;
    }

    public static final /* synthetic */ UnitVolume access$getCubicCentimeters$cp() {
        return cubicCentimeters;
    }

    public static final /* synthetic */ UnitVolume access$getCubicDecimeters$cp() {
        return cubicDecimeters;
    }

    public static final /* synthetic */ UnitVolume access$getCubicFeet$cp() {
        return cubicFeet;
    }

    public static final /* synthetic */ UnitVolume access$getCubicInches$cp() {
        return cubicInches;
    }

    public static final /* synthetic */ UnitVolume access$getCubicKilometers$cp() {
        return cubicKilometers;
    }

    public static final /* synthetic */ UnitVolume access$getCubicMeters$cp() {
        return cubicMeters;
    }

    public static final /* synthetic */ UnitVolume access$getCubicMiles$cp() {
        return cubicMiles;
    }

    public static final /* synthetic */ UnitVolume access$getCubicMillimeters$cp() {
        return cubicMillimeters;
    }

    public static final /* synthetic */ UnitVolume access$getCubicYards$cp() {
        return cubicYards;
    }

    public static final /* synthetic */ UnitVolume access$getCups$cp() {
        return cups;
    }

    public static final /* synthetic */ UnitVolume access$getDeciliters$cp() {
        return deciliters;
    }

    public static final /* synthetic */ UnitVolume access$getFluidOunces$cp() {
        return fluidOunces;
    }

    public static final /* synthetic */ UnitVolume access$getGallons$cp() {
        return gallons;
    }

    public static final /* synthetic */ UnitVolume access$getImperialFluidOunces$cp() {
        return imperialFluidOunces;
    }

    public static final /* synthetic */ UnitVolume access$getImperialGallons$cp() {
        return imperialGallons;
    }

    public static final /* synthetic */ UnitVolume access$getImperialPints$cp() {
        return imperialPints;
    }

    public static final /* synthetic */ UnitVolume access$getImperialQuarts$cp() {
        return imperialQuarts;
    }

    public static final /* synthetic */ UnitVolume access$getImperialTablespoons$cp() {
        return imperialTablespoons;
    }

    public static final /* synthetic */ UnitVolume access$getImperialTeaspoons$cp() {
        return imperialTeaspoons;
    }

    public static final /* synthetic */ UnitVolume access$getKiloliters$cp() {
        return kiloliters;
    }

    public static final /* synthetic */ UnitVolume access$getLiters$cp() {
        return liters;
    }

    public static final /* synthetic */ UnitVolume access$getMegaliters$cp() {
        return megaliters;
    }

    public static final /* synthetic */ UnitVolume access$getMetricCups$cp() {
        return metricCups;
    }

    public static final /* synthetic */ UnitVolume access$getMilliliters$cp() {
        return milliliters;
    }

    public static final /* synthetic */ UnitVolume access$getPints$cp() {
        return pints;
    }

    public static final /* synthetic */ UnitVolume access$getQuarts$cp() {
        return quarts;
    }

    public static final /* synthetic */ UnitVolume access$getTablespoons$cp() {
        return tablespoons;
    }

    public static final /* synthetic */ UnitVolume access$getTeaspoons$cp() {
        return teaspoons;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010D\u001a\u00020EH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0014\u00102\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0014\u00104\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0014\u00106\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007R\u0014\u00108\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0007R\u0014\u0010:\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0007R\u0014\u0010<\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0007R\u0014\u0010>\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0007R\u0014\u0010@\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007R\u0014\u0010B\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0007¨\u0006F"}, d2 = {"Lskip/foundation/UnitVolume$Companion;", "Lskip/foundation/UnitVolume$CompanionClass;", "<init>", "()V", "megaliters", "Lskip/foundation/UnitVolume;", "getMegaliters", "()Lskip/foundation/UnitVolume;", "kiloliters", "getKiloliters", "liters", "getLiters", "deciliters", "getDeciliters", "centiliters", "getCentiliters", "milliliters", "getMilliliters", "cubicKilometers", "getCubicKilometers", "cubicMeters", "getCubicMeters", "cubicDecimeters", "getCubicDecimeters", "cubicCentimeters", "getCubicCentimeters", "cubicMillimeters", "getCubicMillimeters", "cubicInches", "getCubicInches", "cubicFeet", "getCubicFeet", "cubicYards", "getCubicYards", "cubicMiles", "getCubicMiles", "acreFeet", "getAcreFeet", "bushels", "getBushels", "teaspoons", "getTeaspoons", "tablespoons", "getTablespoons", "fluidOunces", "getFluidOunces", "cups", "getCups", "pints", "getPints", "quarts", "getQuarts", "gallons", "getGallons", "imperialTeaspoons", "getImperialTeaspoons", "imperialTablespoons", "getImperialTablespoons", "imperialFluidOunces", "getImperialFluidOunces", "imperialPints", "getImperialPints", "imperialQuarts", "getImperialQuarts", "imperialGallons", "getImperialGallons", "metricCups", "getMetricCups", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getLiters();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getAcreFeet() {
            return UnitVolume.access$getAcreFeet$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getBushels() {
            return UnitVolume.access$getBushels$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCentiliters() {
            return UnitVolume.access$getCentiliters$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCubicCentimeters() {
            return UnitVolume.access$getCubicCentimeters$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCubicDecimeters() {
            return UnitVolume.access$getCubicDecimeters$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCubicFeet() {
            return UnitVolume.access$getCubicFeet$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCubicInches() {
            return UnitVolume.access$getCubicInches$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCubicKilometers() {
            return UnitVolume.access$getCubicKilometers$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCubicMeters() {
            return UnitVolume.access$getCubicMeters$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCubicMiles() {
            return UnitVolume.access$getCubicMiles$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCubicMillimeters() {
            return UnitVolume.access$getCubicMillimeters$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCubicYards() {
            return UnitVolume.access$getCubicYards$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getCups() {
            return UnitVolume.access$getCups$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getDeciliters() {
            return UnitVolume.access$getDeciliters$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getFluidOunces() {
            return UnitVolume.access$getFluidOunces$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getGallons() {
            return UnitVolume.access$getGallons$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getImperialFluidOunces() {
            return UnitVolume.access$getImperialFluidOunces$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getImperialGallons() {
            return UnitVolume.access$getImperialGallons$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getImperialPints() {
            return UnitVolume.access$getImperialPints$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getImperialQuarts() {
            return UnitVolume.access$getImperialQuarts$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getImperialTablespoons() {
            return UnitVolume.access$getImperialTablespoons$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getImperialTeaspoons() {
            return UnitVolume.access$getImperialTeaspoons$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getKiloliters() {
            return UnitVolume.access$getKiloliters$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getLiters() {
            return UnitVolume.access$getLiters$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getMegaliters() {
            return UnitVolume.access$getMegaliters$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getMetricCups() {
            return UnitVolume.access$getMetricCups$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getMilliliters() {
            return UnitVolume.access$getMilliliters$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getPints() {
            return UnitVolume.access$getPints$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getQuarts() {
            return UnitVolume.access$getQuarts$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getTablespoons() {
            return UnitVolume.access$getTablespoons$cp();
        }

        @Override // skip.foundation.UnitVolume.CompanionClass
        public UnitVolume getTeaspoons() {
            return UnitVolume.access$getTeaspoons$cp();
        }

        private Companion() {
        }
    }
}

package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitLength;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitLength extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitLength megameters = new UnitLength("Mm", new UnitConverterLinear(1000000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength kilometers = new UnitLength("km", new UnitConverterLinear(1000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength hectometers = new UnitLength("hm", new UnitConverterLinear(100.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength decameters = new UnitLength("dam", new UnitConverterLinear(10.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength meters = new UnitLength("m", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength decimeters = new UnitLength("dm", new UnitConverterLinear(0.1d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength centimeters = new UnitLength("cm", new UnitConverterLinear(0.01d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength millimeters = new UnitLength("mm", new UnitConverterLinear(0.001d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength micrometers = new UnitLength("µm", new UnitConverterLinear(1.0E-6d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength nanometers = new UnitLength("nm", new UnitConverterLinear(1.0E-9d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength picometers = new UnitLength("pm", new UnitConverterLinear(1.0E-12d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength inches = new UnitLength("in", new UnitConverterLinear(0.0254d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength feet = new UnitLength("ft", new UnitConverterLinear(0.3048d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength yards = new UnitLength("yd", new UnitConverterLinear(0.9144d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength miles = new UnitLength("mi", new UnitConverterLinear(1609.344d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength scandinavianMiles = new UnitLength("smi", new UnitConverterLinear(10000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength lightyears = new UnitLength("ly", new UnitConverterLinear(9.4607304725808E15d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength nauticalMiles = new UnitLength("NM", new UnitConverterLinear(1852.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength fathoms = new UnitLength("ftm", new UnitConverterLinear(1.8288d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength furlongs = new UnitLength("fur", new UnitConverterLinear(201.168d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength astronomicalUnits = new UnitLength("ua", new UnitConverterLinear(1.495978707E11d, ConstantsKt.UNSET, 2, null));
    private static final UnitLength parsecs = new UnitLength("pc", new UnitConverterLinear(3.0856775814913672E16d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00102\u001a\u000203H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0007¨\u00064"}, d2 = {"Lskip/foundation/UnitLength$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "megameters", "Lskip/foundation/UnitLength;", "getMegameters", "()Lskip/foundation/UnitLength;", "kilometers", "getKilometers", "hectometers", "getHectometers", "decameters", "getDecameters", "meters", "getMeters", "decimeters", "getDecimeters", "centimeters", "getCentimeters", "millimeters", "getMillimeters", "micrometers", "getMicrometers", "nanometers", "getNanometers", "picometers", "getPicometers", "inches", "getInches", "feet", "getFeet", "yards", "getYards", "miles", "getMiles", "scandinavianMiles", "getScandinavianMiles", "lightyears", "getLightyears", "nauticalMiles", "getNauticalMiles", "fathoms", "getFathoms", "furlongs", "getFurlongs", "astronomicalUnits", "getAstronomicalUnits", "parsecs", "getParsecs", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitLength.INSTANCE.baseUnit();
        }

        public UnitLength getAstronomicalUnits() {
            return UnitLength.INSTANCE.getAstronomicalUnits();
        }

        public UnitLength getCentimeters() {
            return UnitLength.INSTANCE.getCentimeters();
        }

        public UnitLength getDecameters() {
            return UnitLength.INSTANCE.getDecameters();
        }

        public UnitLength getDecimeters() {
            return UnitLength.INSTANCE.getDecimeters();
        }

        public UnitLength getFathoms() {
            return UnitLength.INSTANCE.getFathoms();
        }

        public UnitLength getFeet() {
            return UnitLength.INSTANCE.getFeet();
        }

        public UnitLength getFurlongs() {
            return UnitLength.INSTANCE.getFurlongs();
        }

        public UnitLength getHectometers() {
            return UnitLength.INSTANCE.getHectometers();
        }

        public UnitLength getInches() {
            return UnitLength.INSTANCE.getInches();
        }

        public UnitLength getKilometers() {
            return UnitLength.INSTANCE.getKilometers();
        }

        public UnitLength getLightyears() {
            return UnitLength.INSTANCE.getLightyears();
        }

        public UnitLength getMegameters() {
            return UnitLength.INSTANCE.getMegameters();
        }

        public UnitLength getMeters() {
            return UnitLength.INSTANCE.getMeters();
        }

        public UnitLength getMicrometers() {
            return UnitLength.INSTANCE.getMicrometers();
        }

        public UnitLength getMiles() {
            return UnitLength.INSTANCE.getMiles();
        }

        public UnitLength getMillimeters() {
            return UnitLength.INSTANCE.getMillimeters();
        }

        public UnitLength getNanometers() {
            return UnitLength.INSTANCE.getNanometers();
        }

        public UnitLength getNauticalMiles() {
            return UnitLength.INSTANCE.getNauticalMiles();
        }

        public UnitLength getParsecs() {
            return UnitLength.INSTANCE.getParsecs();
        }

        public UnitLength getPicometers() {
            return UnitLength.INSTANCE.getPicometers();
        }

        public UnitLength getScandinavianMiles() {
            return UnitLength.INSTANCE.getScandinavianMiles();
        }

        public UnitLength getYards() {
            return UnitLength.INSTANCE.getYards();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitLength(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitLength access$getAstronomicalUnits$cp() {
        return astronomicalUnits;
    }

    public static final /* synthetic */ UnitLength access$getCentimeters$cp() {
        return centimeters;
    }

    public static final /* synthetic */ UnitLength access$getDecameters$cp() {
        return decameters;
    }

    public static final /* synthetic */ UnitLength access$getDecimeters$cp() {
        return decimeters;
    }

    public static final /* synthetic */ UnitLength access$getFathoms$cp() {
        return fathoms;
    }

    public static final /* synthetic */ UnitLength access$getFeet$cp() {
        return feet;
    }

    public static final /* synthetic */ UnitLength access$getFurlongs$cp() {
        return furlongs;
    }

    public static final /* synthetic */ UnitLength access$getHectometers$cp() {
        return hectometers;
    }

    public static final /* synthetic */ UnitLength access$getInches$cp() {
        return inches;
    }

    public static final /* synthetic */ UnitLength access$getKilometers$cp() {
        return kilometers;
    }

    public static final /* synthetic */ UnitLength access$getLightyears$cp() {
        return lightyears;
    }

    public static final /* synthetic */ UnitLength access$getMegameters$cp() {
        return megameters;
    }

    public static final /* synthetic */ UnitLength access$getMeters$cp() {
        return meters;
    }

    public static final /* synthetic */ UnitLength access$getMicrometers$cp() {
        return micrometers;
    }

    public static final /* synthetic */ UnitLength access$getMiles$cp() {
        return miles;
    }

    public static final /* synthetic */ UnitLength access$getMillimeters$cp() {
        return millimeters;
    }

    public static final /* synthetic */ UnitLength access$getNanometers$cp() {
        return nanometers;
    }

    public static final /* synthetic */ UnitLength access$getNauticalMiles$cp() {
        return nauticalMiles;
    }

    public static final /* synthetic */ UnitLength access$getParsecs$cp() {
        return parsecs;
    }

    public static final /* synthetic */ UnitLength access$getPicometers$cp() {
        return picometers;
    }

    public static final /* synthetic */ UnitLength access$getScandinavianMiles$cp() {
        return scandinavianMiles;
    }

    public static final /* synthetic */ UnitLength access$getYards$cp() {
        return yards;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00102\u001a\u000203H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007¨\u00064"}, d2 = {"Lskip/foundation/UnitLength$Companion;", "Lskip/foundation/UnitLength$CompanionClass;", "<init>", "()V", "megameters", "Lskip/foundation/UnitLength;", "getMegameters", "()Lskip/foundation/UnitLength;", "kilometers", "getKilometers", "hectometers", "getHectometers", "decameters", "getDecameters", "meters", "getMeters", "decimeters", "getDecimeters", "centimeters", "getCentimeters", "millimeters", "getMillimeters", "micrometers", "getMicrometers", "nanometers", "getNanometers", "picometers", "getPicometers", "inches", "getInches", "feet", "getFeet", "yards", "getYards", "miles", "getMiles", "scandinavianMiles", "getScandinavianMiles", "lightyears", "getLightyears", "nauticalMiles", "getNauticalMiles", "fathoms", "getFathoms", "furlongs", "getFurlongs", "astronomicalUnits", "getAstronomicalUnits", "parsecs", "getParsecs", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitLength.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getMeters();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getAstronomicalUnits() {
            return UnitLength.access$getAstronomicalUnits$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getCentimeters() {
            return UnitLength.access$getCentimeters$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getDecameters() {
            return UnitLength.access$getDecameters$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getDecimeters() {
            return UnitLength.access$getDecimeters$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getFathoms() {
            return UnitLength.access$getFathoms$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getFeet() {
            return UnitLength.access$getFeet$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getFurlongs() {
            return UnitLength.access$getFurlongs$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getHectometers() {
            return UnitLength.access$getHectometers$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getInches() {
            return UnitLength.access$getInches$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getKilometers() {
            return UnitLength.access$getKilometers$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getLightyears() {
            return UnitLength.access$getLightyears$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getMegameters() {
            return UnitLength.access$getMegameters$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getMeters() {
            return UnitLength.access$getMeters$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getMicrometers() {
            return UnitLength.access$getMicrometers$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getMiles() {
            return UnitLength.access$getMiles$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getMillimeters() {
            return UnitLength.access$getMillimeters$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getNanometers() {
            return UnitLength.access$getNanometers$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getNauticalMiles() {
            return UnitLength.access$getNauticalMiles$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getParsecs() {
            return UnitLength.access$getParsecs$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getPicometers() {
            return UnitLength.access$getPicometers$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getScandinavianMiles() {
            return UnitLength.access$getScandinavianMiles$cp();
        }

        @Override // skip.foundation.UnitLength.CompanionClass
        public UnitLength getYards() {
            return UnitLength.access$getYards$cp();
        }

        private Companion() {
        }
    }
}

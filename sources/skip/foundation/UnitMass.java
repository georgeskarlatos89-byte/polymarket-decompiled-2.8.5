package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitMass;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitMass extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitMass kilograms = new UnitMass("kg", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass grams = new UnitMass("g", new UnitConverterLinear(0.001d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass decigrams = new UnitMass("dg", new UnitConverterLinear(1.0E-4d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass centigrams = new UnitMass("cg", new UnitConverterLinear(1.0E-5d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass milligrams = new UnitMass("mg", new UnitConverterLinear(1.0E-6d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass micrograms = new UnitMass("µg", new UnitConverterLinear(1.0E-9d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass nanograms = new UnitMass("ng", new UnitConverterLinear(1.0E-12d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass picograms = new UnitMass("pg", new UnitConverterLinear(1.0E-15d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass ounces = new UnitMass("oz", new UnitConverterLinear(0.0283495d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass pounds = new UnitMass("lb", new UnitConverterLinear(0.453592d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass stones = new UnitMass("st", new UnitConverterLinear(6.35029d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass metricTons = new UnitMass("t", new UnitConverterLinear(1000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass shortTons = new UnitMass("ton", new UnitConverterLinear(907.185d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass carats = new UnitMass("ct", new UnitConverterLinear(2.0E-4d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass ouncesTroy = new UnitMass("oz t", new UnitConverterLinear(0.0311035d, ConstantsKt.UNSET, 2, null));
    private static final UnitMass slugs = new UnitMass("slug", new UnitConverterLinear(14.5939d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010&\u001a\u00020'H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0007¨\u0006("}, d2 = {"Lskip/foundation/UnitMass$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "kilograms", "Lskip/foundation/UnitMass;", "getKilograms", "()Lskip/foundation/UnitMass;", "grams", "getGrams", "decigrams", "getDecigrams", "centigrams", "getCentigrams", "milligrams", "getMilligrams", "micrograms", "getMicrograms", "nanograms", "getNanograms", "picograms", "getPicograms", "ounces", "getOunces", "pounds", "getPounds", "stones", "getStones", "metricTons", "getMetricTons", "shortTons", "getShortTons", "carats", "getCarats", "ouncesTroy", "getOuncesTroy", "slugs", "getSlugs", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitMass.INSTANCE.baseUnit();
        }

        public UnitMass getCarats() {
            return UnitMass.INSTANCE.getCarats();
        }

        public UnitMass getCentigrams() {
            return UnitMass.INSTANCE.getCentigrams();
        }

        public UnitMass getDecigrams() {
            return UnitMass.INSTANCE.getDecigrams();
        }

        public UnitMass getGrams() {
            return UnitMass.INSTANCE.getGrams();
        }

        public UnitMass getKilograms() {
            return UnitMass.INSTANCE.getKilograms();
        }

        public UnitMass getMetricTons() {
            return UnitMass.INSTANCE.getMetricTons();
        }

        public UnitMass getMicrograms() {
            return UnitMass.INSTANCE.getMicrograms();
        }

        public UnitMass getMilligrams() {
            return UnitMass.INSTANCE.getMilligrams();
        }

        public UnitMass getNanograms() {
            return UnitMass.INSTANCE.getNanograms();
        }

        public UnitMass getOunces() {
            return UnitMass.INSTANCE.getOunces();
        }

        public UnitMass getOuncesTroy() {
            return UnitMass.INSTANCE.getOuncesTroy();
        }

        public UnitMass getPicograms() {
            return UnitMass.INSTANCE.getPicograms();
        }

        public UnitMass getPounds() {
            return UnitMass.INSTANCE.getPounds();
        }

        public UnitMass getShortTons() {
            return UnitMass.INSTANCE.getShortTons();
        }

        public UnitMass getSlugs() {
            return UnitMass.INSTANCE.getSlugs();
        }

        public UnitMass getStones() {
            return UnitMass.INSTANCE.getStones();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitMass(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitMass access$getCarats$cp() {
        return carats;
    }

    public static final /* synthetic */ UnitMass access$getCentigrams$cp() {
        return centigrams;
    }

    public static final /* synthetic */ UnitMass access$getDecigrams$cp() {
        return decigrams;
    }

    public static final /* synthetic */ UnitMass access$getGrams$cp() {
        return grams;
    }

    public static final /* synthetic */ UnitMass access$getKilograms$cp() {
        return kilograms;
    }

    public static final /* synthetic */ UnitMass access$getMetricTons$cp() {
        return metricTons;
    }

    public static final /* synthetic */ UnitMass access$getMicrograms$cp() {
        return micrograms;
    }

    public static final /* synthetic */ UnitMass access$getMilligrams$cp() {
        return milligrams;
    }

    public static final /* synthetic */ UnitMass access$getNanograms$cp() {
        return nanograms;
    }

    public static final /* synthetic */ UnitMass access$getOunces$cp() {
        return ounces;
    }

    public static final /* synthetic */ UnitMass access$getOuncesTroy$cp() {
        return ouncesTroy;
    }

    public static final /* synthetic */ UnitMass access$getPicograms$cp() {
        return picograms;
    }

    public static final /* synthetic */ UnitMass access$getPounds$cp() {
        return pounds;
    }

    public static final /* synthetic */ UnitMass access$getShortTons$cp() {
        return shortTons;
    }

    public static final /* synthetic */ UnitMass access$getSlugs$cp() {
        return slugs;
    }

    public static final /* synthetic */ UnitMass access$getStones$cp() {
        return stones;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010&\u001a\u00020'H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007¨\u0006("}, d2 = {"Lskip/foundation/UnitMass$Companion;", "Lskip/foundation/UnitMass$CompanionClass;", "<init>", "()V", "kilograms", "Lskip/foundation/UnitMass;", "getKilograms", "()Lskip/foundation/UnitMass;", "grams", "getGrams", "decigrams", "getDecigrams", "centigrams", "getCentigrams", "milligrams", "getMilligrams", "micrograms", "getMicrograms", "nanograms", "getNanograms", "picograms", "getPicograms", "ounces", "getOunces", "pounds", "getPounds", "stones", "getStones", "metricTons", "getMetricTons", "shortTons", "getShortTons", "carats", "getCarats", "ouncesTroy", "getOuncesTroy", "slugs", "getSlugs", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitMass.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getKilograms();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getCarats() {
            return UnitMass.access$getCarats$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getCentigrams() {
            return UnitMass.access$getCentigrams$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getDecigrams() {
            return UnitMass.access$getDecigrams$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getGrams() {
            return UnitMass.access$getGrams$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getKilograms() {
            return UnitMass.access$getKilograms$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getMetricTons() {
            return UnitMass.access$getMetricTons$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getMicrograms() {
            return UnitMass.access$getMicrograms$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getMilligrams() {
            return UnitMass.access$getMilligrams$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getNanograms() {
            return UnitMass.access$getNanograms$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getOunces() {
            return UnitMass.access$getOunces$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getOuncesTroy() {
            return UnitMass.access$getOuncesTroy$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getPicograms() {
            return UnitMass.access$getPicograms$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getPounds() {
            return UnitMass.access$getPounds$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getShortTons() {
            return UnitMass.access$getShortTons$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getSlugs() {
            return UnitMass.access$getSlugs$cp();
        }

        @Override // skip.foundation.UnitMass.CompanionClass
        public UnitMass getStones() {
            return UnitMass.access$getStones$cp();
        }

        private Companion() {
        }
    }
}

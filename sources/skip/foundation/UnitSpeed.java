package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitSpeed;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitSpeed extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitSpeed metersPerSecond = new UnitSpeed("m/s", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitSpeed kilometersPerHour = new UnitSpeed("km/h", new UnitConverterLinear(0.277778d, ConstantsKt.UNSET, 2, null));
    private static final UnitSpeed milesPerHour = new UnitSpeed("mph", new UnitConverterLinear(0.44704d, ConstantsKt.UNSET, 2, null));
    private static final UnitSpeed knots = new UnitSpeed("kn", new UnitConverterLinear(0.514444d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lskip/foundation/UnitSpeed$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "metersPerSecond", "Lskip/foundation/UnitSpeed;", "getMetersPerSecond", "()Lskip/foundation/UnitSpeed;", "kilometersPerHour", "getKilometersPerHour", "milesPerHour", "getMilesPerHour", "knots", "getKnots", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitSpeed.INSTANCE.baseUnit();
        }

        public UnitSpeed getKilometersPerHour() {
            return UnitSpeed.INSTANCE.getKilometersPerHour();
        }

        public UnitSpeed getKnots() {
            return UnitSpeed.INSTANCE.getKnots();
        }

        public UnitSpeed getMetersPerSecond() {
            return UnitSpeed.INSTANCE.getMetersPerSecond();
        }

        public UnitSpeed getMilesPerHour() {
            return UnitSpeed.INSTANCE.getMilesPerHour();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitSpeed(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitSpeed access$getKilometersPerHour$cp() {
        return kilometersPerHour;
    }

    public static final /* synthetic */ UnitSpeed access$getKnots$cp() {
        return knots;
    }

    public static final /* synthetic */ UnitSpeed access$getMetersPerSecond$cp() {
        return metersPerSecond;
    }

    public static final /* synthetic */ UnitSpeed access$getMilesPerHour$cp() {
        return milesPerHour;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lskip/foundation/UnitSpeed$Companion;", "Lskip/foundation/UnitSpeed$CompanionClass;", "<init>", "()V", "metersPerSecond", "Lskip/foundation/UnitSpeed;", "getMetersPerSecond", "()Lskip/foundation/UnitSpeed;", "kilometersPerHour", "getKilometersPerHour", "milesPerHour", "getMilesPerHour", "knots", "getKnots", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitSpeed.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getMetersPerSecond();
        }

        @Override // skip.foundation.UnitSpeed.CompanionClass
        public UnitSpeed getKilometersPerHour() {
            return UnitSpeed.access$getKilometersPerHour$cp();
        }

        @Override // skip.foundation.UnitSpeed.CompanionClass
        public UnitSpeed getKnots() {
            return UnitSpeed.access$getKnots$cp();
        }

        @Override // skip.foundation.UnitSpeed.CompanionClass
        public UnitSpeed getMetersPerSecond() {
            return UnitSpeed.access$getMetersPerSecond$cp();
        }

        @Override // skip.foundation.UnitSpeed.CompanionClass
        public UnitSpeed getMilesPerHour() {
            return UnitSpeed.access$getMilesPerHour$cp();
        }

        private Companion() {
        }
    }
}

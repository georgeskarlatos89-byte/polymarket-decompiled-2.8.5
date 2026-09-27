package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitAcceleration;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitAcceleration extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitAcceleration metersPerSecondSquared = new UnitAcceleration("m/s²", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitAcceleration gravity = new UnitAcceleration("g", new UnitConverterLinear(9.81d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lskip/foundation/UnitAcceleration$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "metersPerSecondSquared", "Lskip/foundation/UnitAcceleration;", "getMetersPerSecondSquared", "()Lskip/foundation/UnitAcceleration;", "gravity", "getGravity", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitAcceleration.INSTANCE.baseUnit();
        }

        public UnitAcceleration getGravity() {
            return UnitAcceleration.INSTANCE.getGravity();
        }

        public UnitAcceleration getMetersPerSecondSquared() {
            return UnitAcceleration.INSTANCE.getMetersPerSecondSquared();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitAcceleration(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitAcceleration access$getGravity$cp() {
        return gravity;
    }

    public static final /* synthetic */ UnitAcceleration access$getMetersPerSecondSquared$cp() {
        return metersPerSecondSquared;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lskip/foundation/UnitAcceleration$Companion;", "Lskip/foundation/UnitAcceleration$CompanionClass;", "<init>", "()V", "metersPerSecondSquared", "Lskip/foundation/UnitAcceleration;", "getMetersPerSecondSquared", "()Lskip/foundation/UnitAcceleration;", "gravity", "getGravity", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitAcceleration.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getMetersPerSecondSquared();
        }

        @Override // skip.foundation.UnitAcceleration.CompanionClass
        public UnitAcceleration getGravity() {
            return UnitAcceleration.access$getGravity$cp();
        }

        @Override // skip.foundation.UnitAcceleration.CompanionClass
        public UnitAcceleration getMetersPerSecondSquared() {
            return UnitAcceleration.access$getMetersPerSecondSquared$cp();
        }

        private Companion() {
        }
    }
}

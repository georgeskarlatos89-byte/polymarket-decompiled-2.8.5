package com.polymarket.usviewmodels;

import com.polymarket.data.EAmericanState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Hasher;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00182\u00020\u0001:\u0003\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0082 ¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\fH\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRegion;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "state", "Lcom/polymarket/data/EAmericanState;", "getState", "()Lcom/polymarket/data/EAmericanState;", "Swift_state", "className", "", "districtOrdinal", "", "getDistrictOrdinal", "()Ljava/lang/Integer;", "Swift_districtOrdinal", "(Ljava/lang/String;)Ljava/lang/Integer;", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "StateCase", "DistrictCase", "Companion", "Lcom/polymarket/usviewmodels/MidtermsRegion$DistrictCase;", "Lcom/polymarket/usviewmodels/MidtermsRegion$StateCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class MidtermsRegion implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRegion$DistrictCase;", "Lcom/polymarket/usviewmodels/MidtermsRegion;", "associated0", "Lcom/polymarket/data/EAmericanState;", "associated1", "", "<init>", "(Lcom/polymarket/data/EAmericanState;I)V", "getAssociated0", "()Lcom/polymarket/data/EAmericanState;", "getAssociated1", "()I", "ordinal", "getOrdinal", "equals", "", "other", "", "hashCode", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DistrictCase extends MidtermsRegion {
        private final EAmericanState associated0;
        private final int associated1;
        private final int ordinal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DistrictCase(EAmericanState eAmericanState, int i) {
            super(null);
            eAmericanState.getClass();
            this.associated0 = eAmericanState;
            this.associated1 = i;
            this.ordinal = i;
        }

        public boolean equals(Object other) {
            if (!(other instanceof DistrictCase)) {
                return false;
            }
            DistrictCase districtCase = (DistrictCase) other;
            if (this.associated0 != districtCase.associated0 || this.associated1 != districtCase.associated1) {
                return false;
            }
            return true;
        }

        public final EAmericanState getAssociated0() {
            return this.associated0;
        }

        public final int getAssociated1() {
            return this.associated1;
        }

        public final int getOrdinal() {
            return this.ordinal;
        }

        public int hashCode() {
            Hasher.Companion companion = Hasher.INSTANCE;
            return companion.combine(companion.combine(1, this.associated0), Integer.valueOf(this.associated1));
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRegion$StateCase;", "Lcom/polymarket/usviewmodels/MidtermsRegion;", "associated0", "Lcom/polymarket/data/EAmericanState;", "<init>", "(Lcom/polymarket/data/EAmericanState;)V", "getAssociated0", "()Lcom/polymarket/data/EAmericanState;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class StateCase extends MidtermsRegion {
        private final EAmericanState associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateCase(EAmericanState eAmericanState) {
            super(null);
            eAmericanState.getClass();
            this.associated0 = eAmericanState;
        }

        public boolean equals(Object other) {
            if (!(other instanceof StateCase) || this.associated0 != ((StateCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final EAmericanState getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    public /* synthetic */ MidtermsRegion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Integer Swift_districtOrdinal(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native EAmericanState Swift_state(String className);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final Integer getDistrictOrdinal() {
        return Swift_districtOrdinal(getClass().getName());
    }

    public final EAmericanState getState() {
        return Swift_state(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRegion$Companion;", "", "<init>", "()V", "state", "Lcom/polymarket/usviewmodels/MidtermsRegion;", "associated0", "Lcom/polymarket/data/EAmericanState;", "district", "ordinal", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MidtermsRegion district(EAmericanState associated0, int ordinal) {
            associated0.getClass();
            return new DistrictCase(associated0, ordinal);
        }

        public final MidtermsRegion state(EAmericanState associated0) {
            associated0.getClass();
            return new StateCase(associated0);
        }

        private Companion() {
        }
    }

    private MidtermsRegion() {
    }
}

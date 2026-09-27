package com.polymarket.usviewmodels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "VisibilityAndPermissionsCase", "LeaveSquadCase", "DeleteSquadCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow$DeleteSquadCase;", "Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow$LeaveSquadCase;", "Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow$VisibilityAndPermissionsCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SquadsSettingsSystemRow implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SquadsSettingsSystemRow leaveSquad = new LeaveSquadCase();
    private static final SquadsSettingsSystemRow deleteSquad = new DeleteSquadCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow$DeleteSquadCase;", "Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DeleteSquadCase extends SquadsSettingsSystemRow {
        public DeleteSquadCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow$LeaveSquadCase;", "Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LeaveSquadCase extends SquadsSettingsSystemRow {
        public LeaveSquadCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow$VisibilityAndPermissionsCase;", "Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "detailText", "getDetailText", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class VisibilityAndPermissionsCase extends SquadsSettingsSystemRow {
        private final String associated0;
        private final String detailText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityAndPermissionsCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.detailText = str;
        }

        public boolean equals(Object other) {
            if (!(other instanceof VisibilityAndPermissionsCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((VisibilityAndPermissionsCase) other).associated0);
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getDetailText() {
            return this.detailText;
        }
    }

    public /* synthetic */ SquadsSettingsSystemRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ SquadsSettingsSystemRow access$getDeleteSquad$cp() {
        return deleteSquad;
    }

    public static final /* synthetic */ SquadsSettingsSystemRow access$getLeaveSquad$cp() {
        return leaveSquad;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow$Companion;", "", "<init>", "()V", "visibilityAndPermissions", "Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow;", "detailText", "", "leaveSquad", "getLeaveSquad", "()Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow;", "deleteSquad", "getDeleteSquad", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SquadsSettingsSystemRow getDeleteSquad() {
            return SquadsSettingsSystemRow.access$getDeleteSquad$cp();
        }

        public final SquadsSettingsSystemRow getLeaveSquad() {
            return SquadsSettingsSystemRow.access$getLeaveSquad$cp();
        }

        public final SquadsSettingsSystemRow visibilityAndPermissions(String detailText) {
            detailText.getClass();
            return new VisibilityAndPermissionsCase(detailText);
        }

        private Companion() {
        }
    }

    private SquadsSettingsSystemRow() {
    }
}

package com.polymarket.usviewmodels;

import com.checkout.components.wallet.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptDisplayType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "StandardCase", "ComboCase", "Companion", "Lcom/polymarket/usviewmodels/ReceiptDisplayType$ComboCase;", "Lcom/polymarket/usviewmodels/ReceiptDisplayType$StandardCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ReceiptDisplayType implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReceiptDisplayType standard = new StandardCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptDisplayType$ComboCase;", "Lcom/polymarket/usviewmodels/ReceiptDisplayType;", "associated0", "Lcom/polymarket/usviewmodels/Combo;", "<init>", "(Lcom/polymarket/usviewmodels/Combo;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/Combo;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ComboCase extends ReceiptDisplayType {
        private final Combo associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComboCase(Combo combo) {
            super(null);
            combo.getClass();
            this.associated0 = combo;
        }

        public final Combo getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptDisplayType$StandardCase;", "Lcom/polymarket/usviewmodels/ReceiptDisplayType;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class StandardCase extends ReceiptDisplayType {
        public StandardCase() {
            super(null);
        }
    }

    public /* synthetic */ ReceiptDisplayType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ReceiptDisplayType access$getStandard$cp() {
        return standard;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptDisplayType$Companion;", "", "<init>", "()V", BuildConfig.FLAVOR, "Lcom/polymarket/usviewmodels/ReceiptDisplayType;", "getStandard", "()Lcom/polymarket/usviewmodels/ReceiptDisplayType;", "combo", "associated0", "Lcom/polymarket/usviewmodels/Combo;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReceiptDisplayType combo(Combo associated0) {
            associated0.getClass();
            return new ComboCase(associated0);
        }

        public final ReceiptDisplayType getStandard() {
            return ReceiptDisplayType.access$getStandard$cp();
        }

        private Companion() {
        }
    }

    private ReceiptDisplayType() {
    }
}

package com.polymarket.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/data/ScrollCommandType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "ScrollToTopCase", "ScrollToBottomCase", "Companion", "Lcom/polymarket/data/ScrollCommandType$ScrollToBottomCase;", "Lcom/polymarket/data/ScrollCommandType$ScrollToTopCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ScrollCommandType implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/data/ScrollCommandType$ScrollToBottomCase;", "Lcom/polymarket/data/ScrollCommandType;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "animated", "getAnimated", "equals", "other", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ScrollToBottomCase extends ScrollCommandType {
        private final boolean animated;
        private final boolean associated0;

        public ScrollToBottomCase(boolean z) {
            super(null);
            this.associated0 = z;
            this.animated = z;
        }

        public boolean equals(Object other) {
            if (!(other instanceof ScrollToBottomCase) || this.associated0 != ((ScrollToBottomCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final boolean getAnimated() {
            return this.animated;
        }

        public final boolean getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/data/ScrollCommandType$ScrollToTopCase;", "Lcom/polymarket/data/ScrollCommandType;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "animated", "getAnimated", "equals", "other", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ScrollToTopCase extends ScrollCommandType {
        private final boolean animated;
        private final boolean associated0;

        public ScrollToTopCase(boolean z) {
            super(null);
            this.associated0 = z;
            this.animated = z;
        }

        public boolean equals(Object other) {
            if (!(other instanceof ScrollToTopCase) || this.associated0 != ((ScrollToTopCase) other).associated0) {
                return false;
            }
            return true;
        }

        public final boolean getAnimated() {
            return this.animated;
        }

        public final boolean getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ ScrollCommandType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/data/ScrollCommandType$Companion;", "", "<init>", "()V", "scrollToTop", "Lcom/polymarket/data/ScrollCommandType;", "animated", "", "scrollToBottom", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ScrollCommandType scrollToBottom(boolean animated) {
            return new ScrollToBottomCase(animated);
        }

        public final ScrollCommandType scrollToTop(boolean animated) {
            return new ScrollToTopCase(animated);
        }

        private Companion() {
        }
    }

    private ScrollCommandType() {
    }
}

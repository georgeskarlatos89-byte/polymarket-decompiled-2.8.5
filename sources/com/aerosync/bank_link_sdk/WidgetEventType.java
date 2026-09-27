package com.aerosync.bank_link_sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/aerosync/bank_link_sdk/WidgetEventType;", "", "event", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "WIDGET_PAGE_SUCCESS", "WIDGET_PAGE_LOADED", "WIDGET_CLOSE", "WIDGET_ERROR", "Companion", "bank-link-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public enum WidgetEventType {
    WIDGET_PAGE_SUCCESS("pageSuccess"),
    WIDGET_PAGE_LOADED("widgetPageLoaded"),
    WIDGET_CLOSE("widgetClose"),
    WIDGET_ERROR("widgetError");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String event;

    WidgetEventType(String str) {
        this.event = str;
    }

    public final String getEvent() {
        return this.event;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/aerosync/bank_link_sdk/WidgetEventType$Companion;", "", "()V", "fromEvent", "Lcom/aerosync/bank_link_sdk/WidgetEventType;", "event", "", "bank-link-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WidgetEventType fromEvent(String event) {
            event.getClass();
            for (WidgetEventType widgetEventType : WidgetEventType.values()) {
                if (Intrinsics.areEqual(widgetEventType.getEvent(), event)) {
                    return widgetEventType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}

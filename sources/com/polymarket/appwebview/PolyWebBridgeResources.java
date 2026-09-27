package com.polymarket.appwebview;

import defpackage.ug7;
import defpackage.ww4;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridgeResources;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PolyWebBridgeResources {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ PolyWebBridgeResources[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ PolyWebBridgeResources[] $values() {
        return new PolyWebBridgeResources[0];
    }

    static {
        PolyWebBridgeResources[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private PolyWebBridgeResources(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static PolyWebBridgeResources valueOf(String str) {
        return (PolyWebBridgeResources) Enum.valueOf(PolyWebBridgeResources.class, str);
    }

    public static PolyWebBridgeResources[] values() {
        return (PolyWebBridgeResources[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 J\t\u0010\u000b\u001a\u00020\u0005H\u0082 J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridgeResources$Companion;", "", "<init>", "()V", "bridgeScript", "", "getBridgeScript", "()Ljava/lang/String;", "Swift_Companion_bridgeScript", "bridgeTestHTML", "getBridgeTestHTML", "Swift_Companion_bridgeTestHTML", "bridgeTestURL", "Ljava/net/URI;", "getBridgeTestURL", "()Ljava/net/URI;", "Swift_Companion_bridgeTestURL", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_bridgeScript();

        private final native String Swift_Companion_bridgeTestHTML();

        private final native URI Swift_Companion_bridgeTestURL();

        public final String getBridgeScript() {
            return Swift_Companion_bridgeScript();
        }

        public final String getBridgeTestHTML() {
            return Swift_Companion_bridgeTestHTML();
        }

        public final URI getBridgeTestURL() {
            return Swift_Companion_bridgeTestURL();
        }

        private Companion() {
        }
    }
}

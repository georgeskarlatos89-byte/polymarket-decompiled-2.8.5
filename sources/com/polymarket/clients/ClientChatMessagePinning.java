package com.polymarket.clients;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0082 j\u0002\b\u0005¨\u0006\r"}, d2 = {"Lcom/polymarket/clients/ClientChatMessagePinning;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "noExpiration", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientChatMessagePinning implements SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ClientChatMessagePinning[] $VALUES;
    public static final ClientChatMessagePinning noExpiration = new ClientChatMessagePinning("noExpiration", 0);

    private static final /* synthetic */ ClientChatMessagePinning[] $values() {
        return new ClientChatMessagePinning[]{noExpiration};
    }

    static {
        ClientChatMessagePinning[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ClientChatMessagePinning(String str, int i) {
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ClientChatMessagePinning valueOf(String str) {
        return (ClientChatMessagePinning) Enum.valueOf(ClientChatMessagePinning.class, str);
    }

    public static ClientChatMessagePinning[] values() {
        return (ClientChatMessagePinning[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }
}

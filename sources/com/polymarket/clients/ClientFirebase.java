package com.polymarket.clients;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0006H&J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006H&¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/polymarket/clients/ClientFirebase;", "", "configure", "", "track", "event", "", "parameters", "", "setUserId", "userId", "setUserProperty", "value", "forName", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ClientFirebase {
    void configure();

    void setUserId(String userId);

    void setUserProperty(String value, String forName);

    void track(String event, Map<String, ? extends Object> parameters);
}

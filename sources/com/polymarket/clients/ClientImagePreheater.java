package com.polymarket.clients;

import java.net.URI;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/polymarket/clients/ClientImagePreheater;", "", "preheat", "", "urls", "", "Ljava/net/URI;", "cancelPreheat", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ClientImagePreheater {
    void cancelPreheat(List<URI> urls);

    void preheat(List<URI> urls);
}

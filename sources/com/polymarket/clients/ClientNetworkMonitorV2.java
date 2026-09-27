package com.polymarket.clients;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/polymarket/clients/ClientNetworkMonitorV2;", "", "connection", "Lcom/polymarket/clients/ClientNetworkMonitorConnection;", "getConnection", "()Lcom/polymarket/clients/ClientNetworkMonitorConnection;", "connectionStream", "Lkotlinx/coroutines/flow/Flow;", "getConnectionStream", "()Lkotlinx/coroutines/flow/Flow;", OpsMetricTracker.START, "", "stop", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ClientNetworkMonitorV2 {
    ClientNetworkMonitorConnection getConnection();

    Flow<ClientNetworkMonitorConnection> getConnectionStream();

    void start();

    void stop();
}

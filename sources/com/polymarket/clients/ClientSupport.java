package com.polymarket.clients;

import com.polymarket.data.EAmount;
import com.polymarket.data.EPaymentSelection;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0014\u0012\u0004\u0012\u00020\u00010\u0013H&J \u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0014\u0012\u0004\u0012\u00020\u00010\u0013H&J\b\u0010\u0016\u001a\u00020\u0017H&J \u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH&¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/polymarket/clients/ClientSupport;", "", "loginUser", "", "user", "Lcom/polymarket/clients/ClientSupportUser;", "logout", "handleAppWillEnterForeground", "presentMessenger", "source", "Lcom/polymarket/clients/ClientSupportSource;", "context", "Lcom/polymarket/clients/ClientSupportContext;", "setDeviceToken", "token", "", "isSupportPush", "", "userInfo", "", "Lskip/lib/AnyHashable;", "handlePush", "unreadConversationCount", "", "recordFailedDeposit", "amount", "Lcom/polymarket/data/EAmount;", "paymentSelection", "Lcom/polymarket/data/EPaymentSelection;", "errorDescription", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ClientSupport {
    void handleAppWillEnterForeground();

    void handlePush(Map<Object, ? extends Object> userInfo);

    boolean isSupportPush(Map<Object, ? extends Object> userInfo);

    void loginUser(ClientSupportUser user);

    void logout();

    void presentMessenger(ClientSupportSource source);

    void presentMessenger(ClientSupportSource source, ClientSupportContext context);

    void recordFailedDeposit(EAmount amount, EPaymentSelection paymentSelection, String errorDescription);

    void setDeviceToken(byte[] token);

    int unreadConversationCount();
}

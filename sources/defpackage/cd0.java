package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface cd0 {
    void connect(x81 x81Var);

    void disconnect();

    void disconnect(String str);

    gw7[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(oi9 oi9Var, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(y81 y81Var);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}

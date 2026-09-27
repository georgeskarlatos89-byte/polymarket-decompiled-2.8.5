package com.polymarket.appwebview;

import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import skip.lib.Encodable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/polymarket/appwebview/PolyAppHost;", "Lskip/lib/Encodable;", "contract_version", "", "getContract_version", "()Ljava/lang/String;", "platform", "getPlatform", "app", "getApp", "auth_grant", "getAuth_grant", "theme", "Lcom/polymarket/appwebview/PolyAppHostTheme;", "getTheme", "()Lcom/polymarket/appwebview/PolyAppHostTheme;", ConstantsKt.ENV_FACING_MODE, "getEnvironment", "app_version", "getApp_version", "build_number", "getBuild_number", Keys.KEY_LANGUAGE, "getLanguage", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PolyAppHost extends Encodable {
    String getApp();

    String getApp_version();

    String getAuth_grant();

    String getBuild_number();

    String getContract_version();

    String getEnvironment();

    String getLanguage();

    String getPlatform();

    PolyAppHostTheme getTheme();
}

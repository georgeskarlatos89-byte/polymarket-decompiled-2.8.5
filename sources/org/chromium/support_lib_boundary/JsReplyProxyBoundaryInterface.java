package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface JsReplyProxyBoundaryInterface extends IsomorphicObjectBoundaryInterface {
    void executeJavaScript(String str, InvocationHandler invocationHandler);

    void postMessage(String str);

    void postMessageWithPayload(InvocationHandler invocationHandler);
}

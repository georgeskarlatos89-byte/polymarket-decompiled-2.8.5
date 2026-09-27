package io.ably.lib.util;

import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.Param;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ParamsUtils {
    public static Param[] enrichParams(Param[] paramArr, ClientOptions clientOptions) {
        if (clientOptions.pushFullWait) {
            paramArr = Param.push(paramArr, "fullWait", "true");
        }
        if (clientOptions.addRequestIds) {
            return Param.set(paramArr, Crypto.generateRandomRequestId());
        }
        return paramArr;
    }
}

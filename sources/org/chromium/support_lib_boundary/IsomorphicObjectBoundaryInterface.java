package org.chromium.support_lib_boundary;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface IsomorphicObjectBoundaryInterface {
    Object getOrCreatePeer(Callable<Object> callable);
}

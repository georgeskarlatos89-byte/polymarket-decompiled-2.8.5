package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.view.PreviewView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q3f implements DisplayManager.DisplayListener {
    public final /* synthetic */ PreviewView a;

    public q3f(PreviewView previewView) {
        this.a = previewView;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        PreviewView previewView = this.a;
        Display defaultDisplay = previewView.getDefaultDisplay();
        if (defaultDisplay != null && defaultDisplay.getDisplayId() == i) {
            previewView.a();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}

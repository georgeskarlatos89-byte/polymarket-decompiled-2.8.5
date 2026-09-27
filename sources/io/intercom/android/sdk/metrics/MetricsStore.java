package io.intercom.android.sdk.metrics;

import android.content.Context;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import defpackage.bv2;
import defpackage.uv2;
import defpackage.y4g;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.ops.OpsMetricObject;
import io.intercom.android.sdk.persistence.JsonStorage;
import io.intercom.android.sdk.utilities.IoUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MetricsStore {
    private static final String METRICS_DIR = "intercomMetrics";
    private static final String OPS_METRICS_DIR = "intercomOpsMetrics";
    private static final int STORED_METRIC_LIMIT = 200;
    private static final int STORED_OP_METRIC_LIMIT = 100;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final JsonStorage.LoadFailureHandler deleteOnFailureHandler;
    private final Executor executor;
    private final String installerPackageName;
    private final boolean isDebugBuild;
    private final File metricsDir;
    private final File opsMetricsDir;
    private final JsonStorage storage;
    private final Twig twig;

    public MetricsStore(Context context, Provider<Api> provider, Provider<AppConfig> provider2) {
        this(provider, provider2, Executors.newSingleThreadExecutor(), new JsonStorage(new Gson()), new File(context.getCacheDir(), METRICS_DIR), new File(context.getCacheDir(), OPS_METRICS_DIR), AppTypeDetector.isDebugBuild(context), AppTypeDetector.getInstallerPackageName(context), LumberMill.getLogger());
    }

    public static /* synthetic */ boolean access$000(MetricsStore metricsStore) {
        return metricsStore.hasReachedMetricStorageLimit();
    }

    public static /* synthetic */ File access$100(MetricsStore metricsStore, MetricObject metricObject) {
        return metricsStore.getFile(metricObject);
    }

    public static /* synthetic */ JsonStorage access$200(MetricsStore metricsStore) {
        return metricsStore.storage;
    }

    public static /* synthetic */ boolean access$300(MetricsStore metricsStore) {
        return metricsStore.hasReachedOpsMetricStorageLimit();
    }

    public static /* synthetic */ File access$400(MetricsStore metricsStore, OpsMetricObject opsMetricObject) {
        return metricsStore.getFile(opsMetricObject);
    }

    public static /* synthetic */ void access$500(MetricsStore metricsStore, List list, List list2) {
        metricsStore.uploadMetrics(list, list2);
    }

    public static /* synthetic */ Executor access$600(MetricsStore metricsStore) {
        return metricsStore.executor;
    }

    public static /* synthetic */ void access$700(List list, List list2) {
        copyNonNullItems(list, list2);
    }

    public static /* synthetic */ Twig access$800(MetricsStore metricsStore) {
        return metricsStore.twig;
    }

    private static <T> void copyNonNullItems(List<T> list, List<T> list2) {
        for (T t : list) {
            if (t != null) {
                list2.add(t);
            }
        }
    }

    private File getFile(MetricObject metricObject) {
        return new File(this.metricsDir, metricObject.getId() + ".json");
    }

    private boolean hasReachedMetricStorageLimit() {
        if (this.storage.getDirectoryFileCount(this.metricsDir) > 200) {
            return true;
        }
        return false;
    }

    private boolean hasReachedOpsMetricStorageLimit() {
        if (this.storage.getDirectoryFileCount(this.opsMetricsDir) > 100) {
            return true;
        }
        return false;
    }

    private boolean isDisabled() {
        return !this.appConfigProvider.get().isMetricsEnabled();
    }

    private void uploadMetrics(final List<MetricObject> list, final List<OpsMetricObject> list2) {
        this.apiProvider.get().sendMetrics(list, list2, new uv2() { // from class: io.intercom.android.sdk.metrics.MetricsStore.4
            @Override // defpackage.uv2
            public void onResponse(bv2<Void> bv2Var, y4g<Void> y4gVar) {
                if (!y4gVar.a.getIsSuccessful() && y4gVar.a.code() != 400) {
                    return;
                }
                MetricsStore.access$600(MetricsStore.this).execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        MetricsStore.this.deleteFilesFor(list, list2);
                    }
                });
            }

            @Override // defpackage.uv2
            public void onFailure(bv2<Void> bv2Var, Throwable th) {
            }
        });
    }

    public void deleteFilesFor(List<MetricObject> list, List<OpsMetricObject> list2) {
        Iterator<MetricObject> it = list.iterator();
        while (it.hasNext()) {
            IoUtils.safelyDelete(getFile(it.next()));
        }
        Iterator<OpsMetricObject> it2 = list2.iterator();
        while (it2.hasNext()) {
            IoUtils.safelyDelete(getFile(it2.next()));
        }
    }

    public void loadAndSendMetrics() {
        this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.3
            @Override // java.lang.Runnable
            public void run() {
                List<MetricObject> loadMetrics = MetricsStore.this.loadMetrics();
                List<OpsMetricObject> loadOpsMetrics = MetricsStore.this.loadOpsMetrics();
                if (loadMetrics.isEmpty() && loadOpsMetrics.isEmpty()) {
                    return;
                }
                MetricsStore.access$500(MetricsStore.this, loadMetrics, loadOpsMetrics);
            }
        });
    }

    public List<MetricObject> loadMetrics() {
        final ArrayList arrayList = new ArrayList();
        this.storage.loadFilesInDirectory(this.metricsDir, MetricObject.class, new JsonStorage.LoadHandler<List<MetricObject>>() { // from class: io.intercom.android.sdk.metrics.MetricsStore.5
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
            public /* bridge */ /* synthetic */ void onLoad(List<MetricObject> list) {
                onLoad2(list);
            }

            /* renamed from: onLoad, reason: avoid collision after fix types in other method */
            public void onLoad2(List<MetricObject> list) {
                MetricsStore.access$700(list, arrayList);
            }
        }, this.deleteOnFailureHandler);
        return arrayList;
    }

    public List<OpsMetricObject> loadOpsMetrics() {
        final ArrayList arrayList = new ArrayList();
        this.storage.loadFilesInDirectory(this.opsMetricsDir, OpsMetricObject.class, new JsonStorage.LoadHandler<List<OpsMetricObject>>() { // from class: io.intercom.android.sdk.metrics.MetricsStore.6
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
            public /* bridge */ /* synthetic */ void onLoad(List<OpsMetricObject> list) {
                onLoad2(list);
            }

            /* renamed from: onLoad, reason: avoid collision after fix types in other method */
            public void onLoad2(List<OpsMetricObject> list) {
                MetricsStore.access$700(list, arrayList);
            }
        }, this.deleteOnFailureHandler);
        return arrayList;
    }

    public void track(final MetricObject metricObject) {
        if (isDisabled()) {
            return;
        }
        metricObject.addInstallerPackageName(this.installerPackageName).addIsDebugBuild(this.isDebugBuild);
        this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.1
            @Override // java.lang.Runnable
            public void run() {
                if (MetricsStore.access$000(MetricsStore.this)) {
                    return;
                }
                JsonStorage access$200 = MetricsStore.access$200(MetricsStore.this);
                MetricObject metricObject2 = metricObject;
                access$200.saveToFileAsJson(metricObject2, MetricsStore.access$100(MetricsStore.this, metricObject2));
            }
        });
    }

    private File getFile(OpsMetricObject opsMetricObject) {
        return new File(this.opsMetricsDir, opsMetricObject.getId() + ".json");
    }

    public void track(final OpsMetricObject opsMetricObject) {
        if (isDisabled()) {
            return;
        }
        this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.2
            @Override // java.lang.Runnable
            public void run() {
                if (MetricsStore.access$300(MetricsStore.this)) {
                    return;
                }
                JsonStorage access$200 = MetricsStore.access$200(MetricsStore.this);
                OpsMetricObject opsMetricObject2 = opsMetricObject;
                access$200.saveToFileAsJson(opsMetricObject2, MetricsStore.access$400(MetricsStore.this, opsMetricObject2));
            }
        });
    }

    public MetricsStore(Provider<Api> provider, Provider<AppConfig> provider2, Executor executor, JsonStorage jsonStorage, File file, File file2, boolean z, String str, Twig twig) {
        this.deleteOnFailureHandler = new JsonStorage.LoadFailureHandler() { // from class: io.intercom.android.sdk.metrics.MetricsStore.7
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadFailureHandler
            public void onLoadFailed(File file3, Exception exc) {
                IoUtils.safelyDelete(file3);
                MetricsStore.access$800(MetricsStore.this).v(exc, "Couldn't load file " + file3.getAbsolutePath(), new Object[0]);
            }
        };
        this.apiProvider = provider;
        this.appConfigProvider = provider2;
        this.executor = executor;
        this.storage = jsonStorage;
        this.metricsDir = file;
        this.opsMetricsDir = file2;
        this.isDebugBuild = z;
        this.installerPackageName = str;
        this.twig = twig;
    }
}

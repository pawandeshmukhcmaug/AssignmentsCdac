#include <iostream>
#include <cmath>
using namespace std;

double computeRMS(double* signal, int n) {
    double sum = 0;

    for (int i = 0; i < n; i++) {
        sum += *(signal + i) * *(signal + i);
    }

    return sqrt(sum / n);
}

void normalise(double* signal, int n) {
    double max = fabs(*signal);

    for (int i = 1; i < n; i++) {
        if (fabs(*(signal + i)) > max)
            max = fabs(*(signal + i));
    }

    for (int i = 0; i < n; i++) {
        *(signal + i) = *(signal + i) / max;
    }
}

int countZeroCrossings(double* signal, int n) {
    int count = 0;

    for (int i = 0; i < n - 1; i++) {
        if (*(signal + i) * *(signal + i + 1) < 0)
            count++;
    }

    return count;
}

void applyGain(double* signal, int n, double gainFactor) {
    for (int i = 0; i < n; i++) {
        *(signal + i) = *(signal + i) * gainFactor;
    }
}

int main() {
    double signal[] = {0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1};
    int n = 7;
    double gainFactor = 2.0;

    cout << "Before : ";
    for (int i = 0; i < n; i++)
        cout << signal[i] << " ";
    cout << endl;

    double rms = computeRMS(signal, n);
    int crossings = countZeroCrossings(signal, n);

    normalise(signal, n);

    cout << "After normalise : ";
    for (int i = 0; i < n; i++)
        cout << signal[i] << " ";
    cout << endl;

    applyGain(signal, n, gainFactor);

    cout << "After gain : ";
    for (int i = 0; i < n; i++)
        cout << signal[i] << " ";
    cout << endl;

    cout << "RMS : " << rms << endl;
    cout << "Zero crossings : " << crossings << endl;

    return 0;
}

Java memory has various levels such as register, cache (L1, L2 and so on), RAM
When program has multiple threads then write from one thread is not guranteed to reach RAM and available to second thread
unless special care is taken like Volatile or synchronization

Although main intent was not successfully observed.

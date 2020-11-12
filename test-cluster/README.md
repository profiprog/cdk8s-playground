# Provision K3S cluster in virtualbox

## Prereauisites
* VirtualBox
* Vagramt
* Assible
* Kubectl

# Commands to set up test-cluster
(optional) If you wish automaticaly update local `/etc/hosts` \
store your sudo password into file `./test-cluster/ansible/.sudo-password`

```bash
cd ./test-cluster
vagrant up --provision
```
# (optional) Add Kubernets Dashboard
## Install command
```bash
cd ./test-cluster
vagrant ssh -- kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.0.4/aio/deploy/recommended.yaml -f - < dashboard-admin-user.yml
```
## Access dashboard
1. start proxy
   ```bash
   source ./test-cluster/use-k3s
   kubectl proxy
   ```
2. visit http://localhost:8001/api/v1/namespaces/kubernetes-dashboard/services/https:kubernetes-dashboard:/proxy/
3. Use access token retrieved by command
    ```bash
    source ./test-cluster/use-k3s
    kubectl -n kubernetes-dashboard describe secret admin-user-token | awk '$1=="token:" {print $2}'
    ```
## Refenrece
https://rancher.com/docs/k3s/latest/en/installation/kube-dashboard/

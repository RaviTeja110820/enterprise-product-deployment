# Enterprise Product Deployment Platform - Complete Project Guide

## Project Overview

The Enterprise Product Deployment Platform automates the complete
software delivery lifecycle on AWS. It integrates source control, CI/CD,
security scanning, infrastructure provisioning, Kubernetes deployment,
centralized logging, monitoring, and rollback capabilities.

## Technology Stack

-   GitHub
-   Jenkins
-   Maven
-   SonarQube
-   Trivy
-   Docker
-   Amazon ECR
-   Terraform
-   Amazon EKS
-   Kubernetes
-   Fluent Bit
-   Elasticsearch
-   Kibana
-   AWS

## Architecture

``` text
Developer
   │
GitHub
   │
Webhook
   │
Jenkins
 ├── Maven Build
 ├── SonarQube
 ├── Trivy
 └── Docker Build
        │
Amazon ECR
        │
Terraform
        │
Amazon EKS
        │
Kubernetes
        │
Spring Boot App
        │
Fluent Bit
        │
Elasticsearch
        │
Kibana
```

## Project Flow

1.  Developer pushes code to GitHub.
2.  GitHub webhook triggers Jenkins.
3.  Jenkins checks out the source code.
4.  Maven builds the application.
5.  SonarQube performs code quality analysis.
6.  Trivy scans for vulnerabilities.
7.  Docker builds the image.
8.  Jenkins pushes the image to Amazon ECR.
9.  Terraform provisions AWS infrastructure.
10. Kubernetes deploys the application to Amazon EKS.
11. Fluent Bit collects logs.
12. Elasticsearch stores logs.
13. Kibana visualizes logs and dashboards.
14. Blue/Green deployment enables safe release and rollback.

## Common Commands

### Git

``` bash
git clone <repo>
git checkout -b feature
git add .
git commit -m "message"
git push origin main
```

### Maven

``` bash
mvn clean compile
mvn test
mvn clean package
```

### Docker

``` bash
docker build -t enterprise-app .
docker push <ecr-uri>:latest
```

### Terraform

``` bash
terraform init
terraform fmt
terraform validate
terraform plan
terraform apply
terraform destroy
```

### AWS CLI

``` bash
aws configure
aws sts get-caller-identity
aws eks update-kubeconfig --region <region> --name <cluster>
```

### Kubernetes

``` bash
kubectl get nodes
kubectl get pods -A
kubectl get svc
kubectl describe pod <pod>
kubectl logs <pod>
kubectl rollout restart deployment/<deployment>
```

## CI/CD Pipeline

1.  Checkout
2.  Build
3.  Unit Test
4.  SonarQube Scan
5.  Trivy Scan
6.  Docker Build
7.  Push to Amazon ECR
8.  Terraform Apply
9.  Deploy to Amazon EKS
10. Verify Deployment

## Monitoring

-   CloudWatch
-   Fluent Bit
-   Elasticsearch
-   Kibana
-   Jenkins Logs
-   Kubernetes Logs

## Security

-   IAM Least Privilege
-   AWS Secrets Manager
-   MFA
-   SonarQube
-   Trivy
-   Security Groups

## Blue/Green Deployment

Blue serves production traffic while Green hosts the new version. After
validation, the Kubernetes Service selector switches traffic to Green.
Rollback is performed by switching the selector back to Blue.

## Backup and Recovery

-   Terraform remote state
-   Backup verification
-   RTO/RPO documentation
-   Disaster recovery procedures

## Troubleshooting

-   Check pods: `kubectl get pods`
-   View logs: `kubectl logs <pod>`
-   Describe pod: `kubectl describe pod <pod>`
-   Validate Terraform: `terraform validate`
-   Verify AWS identity: `aws sts get-caller-identity`

## Conclusion

This project demonstrates an enterprise-grade DevOps pipeline using AWS,
Terraform, Jenkins, Kubernetes, Docker, centralized monitoring,
automated security scanning, and production deployment practices.
